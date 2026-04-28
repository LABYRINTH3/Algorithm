import sys

input = sys.stdin.readline

t = int(input())

ans = []
for _ in range(t):
    n = int(input())
    nums = list(map(int, input().split()))
    sum = 0
    for i in range(n):
        if nums[i]==1 and i!=n-1:
            continue
        else:
            sum+=nums[i]
    if nums.count(1)==n:
        ans.append(1)
    else:
        ans.append(sum%676767677)

print(*ans, sep='\n')