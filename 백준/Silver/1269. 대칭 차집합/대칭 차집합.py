import sys

a, b = map(int, sys.stdin.readline().split())

factor_a = set(map(int, sys.stdin.readline().split()))
factor_b = set(map(int, sys.stdin.readline().split()))


duplicate = len(factor_a & factor_b)

unique = len(factor_a) + len(factor_b) - duplicate * 2

print(unique)
