import sys

input = sys.stdin.readline

N, M = map(int, input().split())

visited = [False]*(N+1)
path = []

def track(max):
    if len(path)==M:
        print(*path)
        return
    
    for num in range(max+1, N+1):
        visited[num] = True
        path.append(num)

        track(num)

        path.pop()
        visited[num] = False

track(0)
