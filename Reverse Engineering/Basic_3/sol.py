data = [
    0x49,
    0x60,
    0x67,
    0x74,
    0x63,
    0x67,
    0x42,
    0x66,
    0x80,
    0x78,
    0x69,
    0x69,
    0x7B,
    0x99,
    0x6D,
    0x88,
    0x68,
    0x94,
    0x9F,
    0x8D,
    0x4D,
    0xA5,
    0x9D,
    0x45,
]
ans = []

for i in range(0, len(data)):
  rev = ((data[i] - i*2) ^ i)
  ans.append(rev)

print(ans)
print(bytes(ans))

# Write up
# for i in range(24):
#     # i ^ a1[i] + 2 * i == data[i]
#     tmp = data[i] - 2 * i
#     tmp = tmp % 256

#     # i ^ a1[i] = tmp
#     a1_i = tmp ^ i

#     result.append(a1_i)