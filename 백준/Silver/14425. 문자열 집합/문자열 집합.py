import sys


def binary_search(arr:list, target:str) -> bool:
    left = 0
    right = len(arr) - 1
    while left <= right:
        mid = (left + right) // 2
        if arr[mid] == target:
            return True
        elif arr[mid] < target:
            left = mid + 1
        else:
            right = mid - 1
    return False

n, m = map(int, sys.stdin.readline().split())

factor = []
for _ in range(n):
    factor.append(sys.stdin.readline().strip())

factor.sort()

sum = 0
for _ in range(m):
    target = sys.stdin.readline().strip()
    if binary_search(factor, target):
        sum += 1

print(sum)