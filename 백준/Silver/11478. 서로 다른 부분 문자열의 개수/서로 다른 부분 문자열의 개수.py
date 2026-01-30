import sys

n = sys.stdin.readline().strip()

factor = set()
for i in range(len(n)):
    for j in range(i + 1, len(n) + 1):
        factor.add(n[i:j])

print(len(factor))