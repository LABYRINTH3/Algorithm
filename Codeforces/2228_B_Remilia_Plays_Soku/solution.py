import sys

input = sys.stdin.readline

t = int(input())

output = []
for _ in range(t):
    n, x1, x2, k = map(int, input().split())
    if x2 >= x1:
        x1, x2 = x2, x1
    if n<=3:
        ans = 1
    else:
        ans = min((x1-x2), (x2+n-x1))+k
    output.append(ans)

print(*output, sep='\n')