import sys

input = sys.stdin.readline

n = int(input())

m = list(map(int, input().split()))
m.sort()

if n%2==0:
    print(m[0]*m[n-1])
else:
    n=n//2
    print(m[n]*m[n])