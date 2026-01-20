n = int(input())

num = 0
for i in range(n):
    if (i+1)*(i+2) >= n*2:
        num = i
        break

left = n - (num*(num+1))//2

if (num+1) % 2 == 0:
    print(f"{left}/{num+2 - left}")
else:
    print(f"{num+2 - left}/{left}")