import sys

input = sys.stdin.readline

n, l = map(int, input().split())

a = [0] + list(map(int, input().split())) + [int(l)]

a.sort()

max = 0
for i in range(n+1):
    diff = a[i+1]-a[i]
    if (i == 0 or i == n) and diff > max:
        max = diff

    elif diff/2 > max:
        max = diff/2

print(max)