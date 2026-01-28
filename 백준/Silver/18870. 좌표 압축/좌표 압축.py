import sys

n = int(sys.stdin.readline())
factor = list(map(int, sys.stdin.readline().split()))

unique_factor = list(set(factor))
unique_factor.sort()

rank = {}
for i in range(len(unique_factor)):
    rank[unique_factor[i]] = i

for i in factor:
    print(rank[i], end=' ')

