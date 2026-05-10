import sys
import bisect
input = sys.stdin.readline

def cal_b(a, k):
    a = sorted(set(a))
    set_a = set(a)
    covered = set()
    list_b = []

    for i in a:
        if i not in covered:
            list_b.append(i)
            value = [x for x in range(i, k+1, i)]
            for v in value:
                if v in set_a:
                    covered.add(v)
                else:
                    return -1
    return list_b


ans = []

n = int(input())
for _ in range(n):
    n, k = map(int, input().split())
    a = list(map(int, input().split()))

    list_b = cal_b(a, k)
    if list_b==-1:
        ans.append("-1")
    else:
        ans.append(str(len(list_b)))
        ans.append(" ".join(map(str, list_b)))

print('\n'.join(ans))