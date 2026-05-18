import sys

input = sys.stdin.readline


def cal_days(mid, count_a):
    sum_days = 0
    for ele in count_a:
        sum_days += ele//mid
    return sum_days

n, m = map(int, input().split())
a = list(map(int, input().split()))

count_a = [0]*101

for e in a:
    count_a[e] += 1

low = 0
high = 100
mid = 50

while (mid != high and mid != low) and mid!=0:
    if cal_days(mid, count_a)<n:
        high = mid
    elif cal_days(mid, count_a)>=n:
        low = mid

    mid = (low+high)//2

    # print("=====", f"{low}", f"{mid}", f"{high}", "=====")

if cal_days(high, count_a)>=n:
    print(high)
    exit()

if mid==0:
    print(mid)
    exit()
if cal_days(mid, count_a)>=n:
    print(mid)
    exit()

if low==0:
    print(mid)
    exit()
if cal_days(low, count_a)>=n:
    print(low)
    exit()