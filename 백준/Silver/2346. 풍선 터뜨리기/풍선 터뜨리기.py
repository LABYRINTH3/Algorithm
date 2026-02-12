import sys
from collections import deque

input = sys.stdin.readline

n = int(input())

factor = list(map(int, input().split()))

d = deque()
for i in range(n):
    d.append((i+1, factor[i]))

out = []
while d:
    idx, val = d.popleft()
    out.append(idx)
    if not d:
        break
    if val > 0:
        d.rotate(-(val - 1))
    else:
        d.rotate(-val)

print(" ".join(map(str, out)))
