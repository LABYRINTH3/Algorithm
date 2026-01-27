import sys

n = int(sys.stdin.readline())

sum = 0
for i in range(1, n-1):
    sum += (n-1-i)*i

print(sum)
print(3)