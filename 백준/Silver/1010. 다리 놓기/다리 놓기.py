import sys
from collections import deque

input = sys.stdin.readline

def factorial(n: int) -> int:
    if n <= 1:
        return 1
    return n * factorial(n - 1)

output = []
n = int(input())
for i in range(n):
    a, b = map(int, input().split())
    output.append(factorial(b) // (factorial(a) * factorial(b-a)))

print("\n".join(map(str, output)))