matrix = []

max_value = -1
max_row = 0
max_col = 0

for _ in range(9):
    matrix.append(list(map(int, input().split())))

for i in range(9):
    for j in range(9):
        if max_value < matrix[i][j]:
            max_value = matrix[i][j]
            max_row = i + 1
            max_col = j + 1

print(max_value)
print(max_row, max_col)
