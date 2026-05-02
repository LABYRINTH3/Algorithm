import sys

input = sys.stdin.readline

n, m = map(int, input().split())

ans = 0
# m을 1/2 or +1

while m!=n:
    if m>n and m%2==0:
        m //= 2
    else:
        m += 1
    ans+=1

print(ans)