num1, num2, num3 = map(int, input().split())
if num1 == num2 and num1 == num3 and num2 == num3:
    print(10000 + 1000 * num1)
elif num1 == num2:
    print(1000 + 100 * num1)
elif num1 == num3:
    print(1000 + 100 * num1)
elif num2 == num3:
    print(1000 + 100 * num2)
else:
    print(max(num1, num2, num3) * 100)