import sys
input = sys.stdin.readline


def factorial(n:int)->int:
    if n == 0:
        return 1
    else:
        return factorial(n-1)*n

n = int(input())

output = 1
if n == 0:
    output = 1
else:
    output = factorial(n)

print(output)
