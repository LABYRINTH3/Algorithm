num1, num2 = map(int, input().strip().split())
if num1 > num2:
    print(">")
elif num1 < num2:
    print("<")
else:
    print("==")