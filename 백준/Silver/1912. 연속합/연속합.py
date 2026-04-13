import sys

input = sys.stdin.readline

n = int(input())
nums = list(map(int, input().split()))

dp_nums = [0] * n

for i in range(n):
    if i == 0:
        dp_nums[i] = nums[i]
    else:
        dp_nums[i] = max(nums[i], dp_nums[i - 1] + nums[i])

print(max(dp_nums))