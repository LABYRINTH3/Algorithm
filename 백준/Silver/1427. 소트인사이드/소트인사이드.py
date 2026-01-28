import sys

n = sys.stdin.readline()

factor = []

for i in range(len(n)-1):
    factor.append(int(n[i]))

factor.sort(reverse=True)

print("".join(map(str, factor)))

