import sys

input = sys.stdin.readline

pair_count = 0

n = int(input())
a = list(map(int, input().split()))
a.sort()

m = int(input())
b = list(map(int, input().split()))
b_def = {}
for i in b:
    if i in b_def:
        b_def[i]+=1
    else:
        b_def[i]=1

for i in a:
    if i-1 in b_def and b_def[i-1]>0:
        pair_count+=1
        b_def[i-1]-=1
    elif i in b_def and b_def[i]>0:
        pair_count+=1
        b_def[i]-=1
    elif i+1 in b_def and b_def[i+1]>0:
        pair_count+=1
        b_def[i+1]-=1

print(pair_count)