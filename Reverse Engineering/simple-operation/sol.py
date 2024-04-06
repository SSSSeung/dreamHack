# https://dreamhack.io/wargame/challenges/836

rand = 0x53525937
val = 'a0b4c1d7'
rev = val[::-1]

digit = int(rev, 16)
ans = digit ^ rand
print(ans)