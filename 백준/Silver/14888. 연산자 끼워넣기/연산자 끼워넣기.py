import sys

input = sys.stdin.readline

n = int(input())
nums = list(map(int, input().split()))
operators_count = list(map(int, input().split()))

max = int(-1e9)
min = int(1e9)
def compute_nums(oper):
    global max, min
    calc = nums[0]
    for opers in enumerate(oper):
        if opers[1] == 0:
            calc = calc + nums[opers[0]+1]
        elif opers[1] == 1:
            calc = calc - nums[opers[0]+1]
        elif opers[1] == 2:
            calc = calc * nums[opers[0]+1]
        elif opers[1] == 3:
            calc = int(calc / nums[opers[0]+1])

    if max < calc:
        max = calc
    if min > calc:
        min = calc
    return calc

path = []
def dfs_oper():
    if len(path) == n-1:
        compute_nums(path)
        return
    for i in range(4):
        if operators_count[i] > 0:
            path.append(i)
            operators_count[i]-=1

            dfs_oper()

            operators_count[i]+=1
            path.pop()



dfs_oper()

print(max)
print(min)