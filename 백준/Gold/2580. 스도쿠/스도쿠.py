import sys

input = sys.stdin.readline

sudoku = [[0] * 9 for _ in range(9)]

for i in range(9):
    sudoku[i] = list(map(int, input().split()))

def check_available(row, col):
    available = [1, 2, 3, 4, 5, 6, 7, 8, 9]

    for i in range(9):
        if sudoku[row][i] in available:
            available.remove(sudoku[row][i])
        if sudoku[i][col] in available:
            available.remove(sudoku[i][col])

    r = (row // 3) * 3
    c = (col // 3) * 3
    for i in range(3):
        for j in range(3):
            if sudoku[r + i][c + j] in available:
                available.remove(sudoku[r + i][c + j])
    
    return available

zeros = []

for r in range(9):
    for c in range(9):
        if sudoku[r][c] == 0:
            zeros.append((r, c))

def sudoku_dfs(depth):
    if depth == len(zeros):
        for row in sudoku:
            print(*row)
        exit()
    r, c = zeros[depth]
    for aval in check_available(r, c):
        sudoku[r][c] = aval
        sudoku_dfs(depth + 1)
        sudoku[r][c] = 0


sudoku_dfs(0)