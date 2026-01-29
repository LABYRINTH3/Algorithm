import sys


def binary_search(arr:list, target:int) -> bool:
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


n = int(sys.stdin.readline())

factor = list(map(int, sys.stdin.readline().split()))

factor.sort()

m = int(sys.stdin.readline())

m_factor = list(map(int, sys.stdin.readline().split()))

for i in m_factor:
    if binary_search(factor, i):
        print(1, end=' ')
    else:
        print(0, end=' ')