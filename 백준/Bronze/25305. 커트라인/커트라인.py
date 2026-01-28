import sys

n, k = map(int, sys.stdin.readline().split())

factor = list(map(int, sys.stdin.readline().split()))

factor.sort(reverse=True)

print(factor[k-1])
