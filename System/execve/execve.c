// Compile : gcc -o execve execve.c -masm=intel

__asm__(
  ".global run_execve\n"
  "run_execve:\n"

  "mov rax, 0x68732f6e69622f  # = '/bin/sh'\n"
  "push rax\n"
  "mov rdi, rsp               # rdi = '/bin/sh'\n"
  "xor rsi, rsi               # rsi = null\n"
  "xor rdx, rdx               # rdx = null\n"
  "mov rax, 0x3b              # rax = 0x3b; syscall_execve\n"
  "syscall                    # execve('/bin/sh', NULL, NULL)\n"
  "\n"
  "xor rdi, rdi   # rid = 0\n"
  "mov rax, 0x3c  # rax = sys_exit\n"
  "syscall        # exit(0)");

  void run_execve();

  int main() { run_execve(); }
