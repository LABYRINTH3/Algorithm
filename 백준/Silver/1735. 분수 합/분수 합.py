import sys

def gcd(a: int, b: int) -> int:
    while b:
        a, b = b, a % b
    return a

def lcm(a: int, b: int) -> int:
    return a * b // gcd(a, b)

a, b = map(int, sys.stdin.readline().split())
c, d = map(int, sys.stdin.readline().split())

f = lcm(b, d)
e = a * (f//b) + c * (f//d)

div = gcd(e, f)
print(e//div, f//div)