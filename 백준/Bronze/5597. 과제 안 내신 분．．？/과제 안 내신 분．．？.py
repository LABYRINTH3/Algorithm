nums = [0] * 31

for _ in range(28):
    a = int(input())
    nums[a] = 1

for i in range(1, 31):
    if nums[i] == 0:
        print(i)