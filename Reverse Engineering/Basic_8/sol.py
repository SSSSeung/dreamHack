data = [
    0xAC,
    0xF3,
    0x0C,
    0x25,
    0xA3,
    0x10,
    0xB7,
    0x25,
    0x16,
    0xC6,
    0xB7,
    0xBC,
    0x07,
    0x25,
    0x02,
    0xD5,
    0xC6,
    0x11,
    0x07,
    0xC5,
]

ans = []
for i in range(0, len(data)):
    for j in range(0, 0xff):
        value = (j * -5) & 0xff
        if (value == data[i]):
            ans.append(j)
            break

print(ans)
print(bytes(ans))
