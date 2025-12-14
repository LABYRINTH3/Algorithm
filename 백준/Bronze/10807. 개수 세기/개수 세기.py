iter = int(input())

nums = list(map(int, input().split()))

n = int(input())

count = 0
for i in nums:
    if i == n:
        count += 1

print(count)