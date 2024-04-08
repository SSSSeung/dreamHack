data = [
    0x52,
    0xDF,
    0xB3,
    0x60,
    0xF1,
    0x8B,
    0x1C,
    0xB5,
    0x57,
    0xD1,
    0x9F,
    0x38,
    0x4B,
    0x29,
    0xD9,
    0x26,
    0x7F,
    0xC9,
    0xA3,
    0xE9,
    0x53,
    0x18,
    0x4F,
    0xB8,
    0x6A,
    0xCB,
    0x87,
    0x58,
    0x5B,
    0x39,
    0x1E,
]

ans = []
for i in range(0, len(data)):
    value = data[i] ^ i
    shift = i & 7
    value2 = (value >> shift | value << (8 - shift)) % 256
    ans.append(value2)

print(ans)
print(bytes(ans))
