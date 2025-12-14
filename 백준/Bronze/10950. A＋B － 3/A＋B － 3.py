iter = int(input())

nums = []
for i in range(iter):
    num1, num2 = map(int, input().strip().split(" "))
    nums.append(num1+num2)

for i in nums:
    print(i)