import sys

a, b, c = map(int, sys.stdin.readline().split())

if max(a, b, c) >= (a + b + c - max(a, b, c)):
    print((a + b + c - max(a, b, c))*2 -1)
else:
    print(a + b + c)