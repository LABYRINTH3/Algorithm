import sys

input = sys.stdin.readline

n = int(input())

v = list(map(int, input().split()))
v_sort = sorted(v)

v_sum = [0]*(len(v)+1)
v_sort_sum = [0]*(len(v)+1)
for i in range(1, len(v)+1):
    v_sum[i] = v_sum[i-1] + v[i-1]
    v_sort_sum[i] = v_sort_sum[i-1] + v_sort[i-1]

# print(*v_sum, *v_sort_sum)

ans = []
m = int(input())
for _ in range(m):
    mlr = list(map(int, input().split()))
    if mlr[0]==1:
        ans.append(v_sum[mlr[2]]-v_sum[mlr[1]-1])
    elif mlr[0]==2:
        ans.append(v_sort_sum[mlr[2]]-v_sort_sum[mlr[1]-1])


print(*ans, sep='\n')