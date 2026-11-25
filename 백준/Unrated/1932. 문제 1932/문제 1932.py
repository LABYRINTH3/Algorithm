import sys

input = sys.stdin.readline

n = int(input())
num_triangle = [[0]*n for _ in range(n)]

dp = [[0]*500 for _ in range(n)]

for i in range(n):
    num_triangle[i] = list(map(int, input().split()))

for i in range(n-1, 0, -1):
    for j in range(i):
        num_triangle[i-1][j]+=max(num_triangle[i][j], num_triangle[i][j+1])

print(num_triangle[0][0])