import sys

x, y, w, h = map(int, sys.stdin.readline().split())

ans = min(x, y, w - x, h - y)

print(ans)