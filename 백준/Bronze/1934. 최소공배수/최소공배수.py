import sys

def gcd(a: int, b: int) -> int:
    while b:
        a, b = b, a % b
    return a

def lcm(a: int, b: int) -> int:
    return a * b // gcd(a, b)

n = int(sys.stdin.readline())

out = []
for _ in range(n):
    a, b = map(int, sys.stdin.readline().split())
    out.append(lcm(a, b))

print("\n".join(map(str, out)))