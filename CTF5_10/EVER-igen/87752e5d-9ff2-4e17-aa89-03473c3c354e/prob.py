import random
from string import ascii_lowercase, ascii_uppercase, digits

words = ascii_uppercase + ascii_lowercase + digits


class Vigenere:
    def __init__(self, key):
        self._key = key

    def shift(self, a, d):
        if a not in words:
            return a
        index = words.index(a)
        return words[(index + d) % len(words)]

    def encrypt(self, pt):
        ct = ""
        for i in range(len(pt)):
            ct += self.shift(pt[i], self._key[i % len(self._key)])
        return ct

    def decrypt(self, ct):
        pt = ""
        for i in range(len(ct)):
            pt += self.shift(ct[i], -self._key[i % len(self._key)])
        return pt


def main():
    # key = [random.randint(0, len(words)) for _ in range(16)]
    # with open("secret", "r") as f:
    #     secret = f.read()

    # print(key)
    # assert "Vigenere", "cipher" in secret
    # cipher = Vigenere(key)
    # secret_enc = cipher.encrypt(secret)
    # print(f"my encrypted sentence > {secret_enc}")

    decryptKey = [47, 22, 41, 1, 29, 2, 53, 53, 35, 20, 47, 60, 20, 0, 48, 5]
    msg = '39 2YAx k5LgCy iP Aj9geVQy nEvXnd3Je c kX9P 8z uZ7dbErYRAyegw Ona3Js eRcKyO u7 ffFTl70 TH9ScB – M0HbNuV HDd 4yk TE c3uVU 8Y D1Q ZDNhBpRc 9WY27fjiF – dVWNBP D1Q NAZsM fW bPlBI N3e p8 6i97Nc. FmP HjIjVi 7Zu 4Zth9 bL kYD Gg0yZjc0 dBrYVQ, f8GQ0PD, Bu kGue 8BUlT9FmE0 UDCNp2vQi xd jkfm97 9uDfndFF egcc9CZ 27 mTE 2Y7u A8Zi fM N4Ks3 UVK Dg0. LTAabG 2RSDTqDu GP7QbLq. qy ZE2Xy GUpG kYD eYvEXf DJdMc fE Ep2DTjX4Zt dlk uObyx f DJq7ckZM0 "w8gse0WtBie" (L 4yk) FT LyZkB1 a29Tjc FmIjRSDDd yFQwj QfMvVi. 9I, Tjc0 dHoVj DSc zXfR. Ek{sreSsZxMq8OPf37BwUdvpZKzQ8oNg7Z8rwASqbxQsBl0g935rwDLQaNxNCnxK44g}'

    index = 41 - 12  # target index
    for i in range(0, len(msg)):
        cipher = Vigenere([i])
        decrypted = cipher.decrypt(msg[index])
        if decrypted == "b":  # expected
            print(index % 16, i)
            decryptKey[index % 16] = i
            break

    cipher = Vigenere(decryptKey)
    res = cipher.decrypt(msg)
    for i in range(0, len(msg)):
        if decryptKey[i % 16]:
            print("\033[36m" + res[i] + "\033[0m", end="")
        else:
            print(res[i], end="")


if __name__ == "__main__":
    main()
