import sys

a, b = map(int, sys.stdin.readline().split())
c, d = map(int, sys.stdin.readline().split())
e, f = map(int, sys.stdin.readline().split())

if a == c:
    x = e
elif a == e:
    x = c
else:
    x = a

if b == d:
    y = f
elif b == f:
    y = d
else:
    y = b

print(x, y)

