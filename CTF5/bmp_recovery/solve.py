# https://en.wikipedia.org/wiki/BMP_file_format

# with open('flag.bmp.broken', 'rb') as f:
#     data = bytearray(f.read())

# pad_first = 0
# pad_last = 0
# for i in range(48, len(data)):
#   if (data[i] != 255 and data[i] != 0):
#     print(i)
#     print(data[i])
#     pad_first = i
#     break

# data.reverse()

# for i in range(0, len(data)):
#    if (data[i] != 255):
#       print (i)
#       print(data[i])
#       pad_last = i
#       break

# data.reverse()

# data2 = []
# for i in range(0, 54):
#     data2.append(data[i])

# for i in range(6895410, len(data)-pad_last):
#     data2.append(data[i])

# with open('flag.bmp.broken2', 'wb') as f:
#   f.write(bytearray(data2))

with open('flag.bmp.broken2', 'rb') as f:
    data = bytearray(f.read())

# signiture
data[0] = ord("B")
data[1] = ord("M")

# file size (473349)
data[2] = 5
data[3] = 57
data[4] = 7

# data offset
data[10] = 54
data[14] = 40

# height
data[22] = 70

# color plain
data[26] = 1

# size of raw bitmap
data[34] = 16

data[38] = 19
data[39] = 11
data[42] = 19
data[43] = 11

# brute force for width
for i in range(2000, 3000):
  data[18] = i%256
  data[19] = int(i/256)
  
  with open('flag' + str(i) + '.bmp', 'wb') as f:
    f.write(bytearray(data))