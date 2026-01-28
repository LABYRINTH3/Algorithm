import sys

n = int(sys.stdin.readline())

factor = []
for _ in range(n):
    factor.append(int(sys.stdin.readline()))

factor.sort()
print("\n".join(map(str, factor)))