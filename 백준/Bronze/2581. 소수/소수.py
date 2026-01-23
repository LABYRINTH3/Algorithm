import sys
import math

num1 = int(sys.stdin.readline())
num2 = int(sys.stdin.readline())

least = 0
sumPrime = 0

if num1 == 1:
    num1 = 2
for i in range(num2, num1-1, -1):
    isPrime=True
    for j in range(2, int(math.isqrt(i)) + 1):
        if i % j == 0:
            isPrime=False
            break
    if isPrime:
        least = i
        sumPrime += i

if least == 0:
    print(-1)
else:
    print(sumPrime)
    print(least)
    