import sys
sys.setrecursionlimit(10**6)
input = sys.stdin.readline

def dfs(graph, i, j):
    if i < 0 or i >= len(graph) or j < 0 or j >= len(graph[0]) or graph[i][j] == 0:
        return
    graph[i][j] = 0
    dfs(graph, i+1, j)
    dfs(graph, i-1, j)
    dfs(graph, i, j+1)
    dfs(graph, i, j-1)

t = int(input())
output = []

for _ in range(t):
    m, n, k = map(int, input().split())

    graph = [[0]*n for _ in range(m)]
    for _ in range(k):
        x, y = map(int, input().split())
        graph[x][y] = 1

    count = 0
    for i in range(m):
        for j in range(n):
            if graph[i][j] == 1:
                count += 1
                dfs(graph, i, j)
    output.append(count)

for i in output:
    print(i)