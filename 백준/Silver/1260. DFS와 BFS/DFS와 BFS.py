import sys
input = sys.stdin.readline

dfs_arr = []
bfs_arr = []

def dfs(graph, i, visited):
    visited[i] = True
    dfs_arr.append(i)
    for j in graph[i]:
        if not visited[j]:
            dfs(graph, j, visited)

def bfs(graph, i, visited):
    visited[i] = True
    bfs_arr.append(i)
    queue = [i]
    while queue:
        j = queue.pop(0)
        for k in graph[j]:
            if not visited[k]:
                visited[k] = True
                bfs_arr.append(k)
                queue.append(k)

n, m, v = map(int, input().split())

graph = [[] for _ in range(n+1)]

for _ in range(m):
    a, b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)

for i in range(n+1):
    graph[i].sort()

visited = [False] * (n+1)
dfs(graph, v, visited)

print(*dfs_arr)

visited = [False] * (n+1)
bfs(graph, v, visited)

print(*bfs_arr)