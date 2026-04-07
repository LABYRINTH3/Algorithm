import sys

input = sys.stdin.readline

n = int(input())

points = [[0]*n for _ in range(n)]

for row in range(n):
    line = map(int, input().split())
    for col, val in enumerate(line):
        points[row][col] = val

# print(points)

start_team = [0,]
min_diff = float('inf')

def dfs(index):
    global min_diff
    if len(start_team)==n/2:
        start_score = sum(points[i][j] for i in start_team for j in start_team)
        link_team = [i for i in range(n) if i not in start_team]
        link_score = sum(points[i][j] for i in link_team for j in link_team)
        if min_diff > abs(start_score-link_score):
            min_diff = abs(start_score-link_score)
        return
    for i in range(index, n):
        if i not in start_team:
            start_team.append(i)
            dfs(i+1)
            start_team.pop()

dfs(0)

print(min_diff)