priceSum = int(input(""))
numSum = int(input(""))
a = 0
for i in range(numSum):
    price , num = map(int, input().split())
    a = a + price * num
if a == priceSum: print("Yes")
else: print("No")