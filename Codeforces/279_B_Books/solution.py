import sys

input = sys.stdin.readline

n, t = map(int, input().split())
a = list(map(int, input().split()))

left = 0
right = 0

ans = 0
sum = a[left]
for i in range(n):
    if i!=0: sum -= a[i-1]
    left = i
    if right<left:
        right = left
        sum = a[left]
    while right + 1 < n and sum + a[right+1] <= t:
        right += 1
        sum += a[right]
    if sum <= t and right-left+1 > ans:
        ans = right-left+1

print(ans)