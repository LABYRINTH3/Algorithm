import sys

input = sys.stdin.readline

t = int(input())


ans = []
for _ in range(t):
    n = int(input())
    p = list(map(int, input().split()))
    count = 0
    for i in range(n-1):
        gcd_check = abs(p[i]-p[i+1])
        if p[i]%gcd_check==0 and p[i+1]%gcd_check==0:
            count+=1

    ans.append(count)

print(*ans, sep='\n')