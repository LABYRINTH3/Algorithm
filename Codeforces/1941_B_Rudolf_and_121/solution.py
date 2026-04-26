import sys

input = sys.stdin.readline

t = int(input())

ans = []
for _ in range(t):
    n = int(input())
    a = list(map(int, input().split()))

    end = False
    for i in range(n-2):
        if a[i]>0:
            a[i+1] = a[i+1] - 2*a[i]
            a[i+2] = a[i+2] - a[i]
            a[i] = 0
        elif a[i]<0:
            ans.append("NO")
            end = True
            break
    if a[n-2]==0 and a[n-1]==0 and end is False:
        ans.append("YES")
    elif end is False:
        ans.append("NO")

print(*ans, sep="\n")