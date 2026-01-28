import sys

n = 5

factor = []
sum = 0
for _ in range(n):
    num = int(sys.stdin.readline())
    factor.append(num)
    sum += num

factor.sort()

print(sum//n)
print(factor[2])