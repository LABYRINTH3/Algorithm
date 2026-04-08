import sys

input = sys.stdin.readline

list_val = [[[0]*21 for _ in range(21)] for _ in range(21)]

for i in range(21):
    for j in range(21):
        for k in range(21):
            if i == 0 or j == 0 or k == 0:
                list_val[i][j][k] = 1
            elif i < j and j < k:
                list_val[i][j][k] = list_val[i][j][k-1] + list_val[i][j-1][k-1] - list_val[i][j-1][k]
            else:
                list_val[i][j][k] = list_val[i-1][j][k] + list_val[i-1][j-1][k] + list_val[i-1][j][k-1] - list_val[i-1][j-1][k-1]


out = []

while True:
    a, b, c = map(int, input().split())
    if a==-1 and b==-1 and c==-1:
        break
    elif a<=0 or b<=0 or c<=0:
        out.append(f"w({a}, {b}, {c}) = {1}")
    elif a>20 or b>20 or c>20:
        out.append(f"w({a}, {b}, {c}) = {list_val[20][20][20]}")
    else:
        out.append(f"w({a}, {b}, {c}) = {list_val[a][b][c]}")

print("\n".join(out))
