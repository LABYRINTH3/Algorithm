import sys
import math

a, b = map(int, sys.stdin.readline().split())

broot = int(math.sqrt(a))

factor = set()
for i in range(1, broot + 1):
    if a % i == 0:
        factor.add(i)
        factor.add(a//i)

factor = list(factor)
factor.sort()

if b > len(factor):
    print(0)
else:
    print(factor[b-1])
            