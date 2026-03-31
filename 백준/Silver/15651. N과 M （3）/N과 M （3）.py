import sys

input = sys.stdin.readline

N, M = map(int, input().split())

path = []

def track():
    if len(path)==M:
        print(*path)
        return
    for i in range(1, N+1):
        path.append(i)
        track()
        path.pop()

track()