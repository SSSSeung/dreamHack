#!/usr/bin/env python3
import hashlib
from qiskit import QuantumCircuit
from qiskit_aer import Aer
from numpy.random import randint
from Crypto.Cipher import AES
from Crypto.Util.Padding import pad, unpad

N = 100
with open("flag", "rb") as f:
    FLAG = f.read()


class Person:
    def __init__(self):
        self.n = N
        self._bases: list[int] = list(randint(2, size=self.n))
        self._bits: list[int] = []
        self._key: list[int] = []
        self._aes_key: bytes = b""

    def get_bases(self) -> list[int]:
        return self._bases

    def get_bits(self) -> list[int]:
        return self._bits

    def get_key(self) -> list[int]:
        return self._key

    def set_shared_key(self, other_bases: list[int]) -> None:
        self._key = []
        for i in range(self.n):
            if self._bases[i] == other_bases[i]:
                self._key.append(self._bits[i])
        self._aes_key = hashlib.md5("".join(map(str, self._key)).encode()).digest()

    def encrypt(self, plaintext: bytes) -> bytes:
        cipher = AES.new(self._aes_key, AES.MODE_ECB)
        return cipher.encrypt(pad(plaintext, 16))

    def decrypt(self, ciphertext: bytes) -> bytes:
        cipher = AES.new(self._aes_key, AES.MODE_ECB)
        return unpad(cipher.decrypt(ciphertext), 16)


class A(Person):
    def __init__(self) -> None:
        super().__init__()
        self._bits = list(randint(2, size=self.n))

    def encode(self) -> list[QuantumCircuit]:
        message: list[QuantumCircuit] = []
        for i in range(self.n):
            circuit = QuantumCircuit(1, 1)
            if self._bases[i] == 0:
                if self._bits[i] == 0:
                    pass
                else:
                    circuit.x(0)
            else:
                if self._bits[i] == 0:
                    circuit.h(0)
                else:
                    circuit.x(0)
                    circuit.h(0)
            circuit.barrier()
            message.append(circuit)
        return message


class B(Person):
    def measure(self, message: list[QuantumCircuit]) -> None:
        self._bits = []
        for i in range(self.n):
            if self._bases[i] == 0:
                message[i].measure(0, 0)
            else:
                message[i].h(0)
                message[i].measure(0, 0)
            aer_sim = Aer.get_backend("aer_simulator")
            result = aer_sim.run(message[i], shots=1, memory=True).result()
            measured_bit = int(result.get_memory()[0])
            self._bits.append(measured_bit)
            # collapse!
            message[i] = QuantumCircuit(1, 1)
            if measured_bit == 0:
                pass
            else:
                message[i].x(0)


def main():
    amo = A()
    boko = B()
    nando = B()

    print("<<<< --  NANDO'S BASE of OPERATION  -- >>>>")
    print("Nando: Today's weapon is ... ")
    nando_bases = nando.get_bases()
    print(f"Nando: {''.join(map(str, nando_bases))}")
    print("===========================================")

    print("\n===== ... Opening Quantum Channel ... =====")
    message = amo.encode()
    print("          Amo == message ==> Boko")
    # !!!  Nando is here to intercept the message !!!
    print("                  Haiya!       ")
    nando.measure(message)
    boko.measure(message)
    print("===== ... Closing Quantum Channel ... =====\n")

    print("\n===== ... Opening Classic Channel ... =====")
    amo_base = amo.get_bases()
    print(f"Amo: {''.join(map(str, amo_base))}")
    boko.set_shared_key(amo_base)
    boko_base = boko.get_bases()
    print(f"Boko: {''.join(map(str, boko_base))}")
    amo.set_shared_key(boko_base)
    enc_flag = boko.encrypt(FLAG)
    print(f"Boko: secret is {enc_flag.hex()}")
    try:
        amo.decrypt(enc_flag)
    except ValueError:
        print("Amo: Oops... I think there might be something wrong with our protocol!")
    print("===== ... Closing Classic Channel ... =====\n")

    print("<<<< --  NANDO'S BASE of OPERATION  -- >>>>")
    nando_bits = nando.get_bits()
    print("Nando: Today's operation has been another successful one. ")
    print(f"Nando: {''.join(map(str, nando_bits))}")
    print("===========================================")


if __name__ == "__main__":
    main()
