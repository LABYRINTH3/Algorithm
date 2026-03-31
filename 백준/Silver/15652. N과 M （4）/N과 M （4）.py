import sys

input = sys.stdin.readline

N, M = map(int, input().split())

path = []

def track(start_point):
    if len(path)==M:
        print(*path)
        return
    for i in range(start_point, N+1):
        path.append(i)

        track(i)

        path.pop()

track(1)