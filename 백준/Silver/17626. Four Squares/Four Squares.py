import sys

n = int(sys.stdin.readline())

square = []
for i in range(1, 224):
    square.append(i*i)

if n in square:
    print(1)
    exit()

for i in square:
    if n - i in square:
        print(2)
        exit()

for i in square:
    for j in square:
        if n - i - j in square:
            print(3)
            exit()

print(4)