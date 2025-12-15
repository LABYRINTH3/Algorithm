def reverse(a, b, nums):
    for i in range(int((b-a)/2)+1):
        nums[a+i], nums[b-i] = nums[b-i], nums[a+i]
    return nums

N, M = map(int, input().split())

nums = [0] * N
for i in range(N):
    nums[i] = i+1

for _ in range(M):
    a, b = map(int, input().split())
    nums = reverse(a-1, b-1, nums)

print(' '.join(map(str, nums)))