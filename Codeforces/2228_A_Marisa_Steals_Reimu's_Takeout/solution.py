import sys

input = sys.stdin.readline

t = int(input())

output = []

for _ in range(t):
    n = int(input())
    w = list(map(int, input().split()))
    count_0 = w.count(0)
    count_1 = w.count(1)
    count_2 = w.count(2)
    output.append(min(count_1, count_2)+count_0+abs(count_1-count_2)//3)

print(*output, sep='\n')