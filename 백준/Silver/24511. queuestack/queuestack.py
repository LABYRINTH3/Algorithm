import sys
from collections import deque

input = sys.stdin.readline

n = int(input())

a = list(map(int, input().split()))
b = list(map(int, input().split()))

c = int(input())
d = list(map(int, input().split()))
out = []

count = 0
iter = 1
while count < c and iter <= n:
    if a[-iter] == 0:
        out.append(b[-iter])
        count += 1
    iter += 1

iter = 0
while count < c:
    out.append(d[iter])
    count += 1
    iter += 1

print(" ".join(map(str, out)))