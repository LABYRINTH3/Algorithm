import sys

n = int(sys.stdin.readline())
x = []
y = []
for _ in range(n):
    a, b = map(int, sys.stdin.readline().split())
    x.append(a)
    y.append(b)

print((max(x) - min(x)) * (max(y) - min(y)))