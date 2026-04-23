import sys
input = sys.stdin.readline

t = int(input())

output = []
for _ in range(t):
    n, k = map(int, input().split())
    a = list(map(int, input().split()))
    # print(a)
    for i in range(n):
        a[i] = a[i]%k
    if 0 in a:
        output.append(0)
    elif k in [2, 3, 5]:
        output.append(k-max(a))
    elif k == 4:
        if a.count(2)>=2:
            output.append(0)
        elif a.count(2)==1 or a.count(3)>0:
           output.append(1)
        else:
            output.append(2)

print(*output, sep="\n")