import sys

input = sys.stdin.readline

n = int(input())

output = []
for _ in range(n):
    n, k = map(int, input().split())
    output.append(k+k//(n-1)-1 if k%(n-1)==0 else k+k//(n-1))
    # 1 2  4 5  7 8  10 11  13 14

print(*output, sep='\n')