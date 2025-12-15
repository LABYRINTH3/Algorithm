N, M = map(int, input().split(" "))

nums = [0] * N

for i in range(N):
    nums[i] = i + 1

for _ in range(M):
    a, b = map(int, input().split(" "))
    nums[a-1], nums[b-1] = nums[b-1], nums[a-1]

print(' '.join(map(str, nums)))