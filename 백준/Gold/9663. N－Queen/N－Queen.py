import sys

input = sys.stdin.readline

N = int(input())

board_row = [False] * N


count = 0
def check_board(board):
    for i in range(N):
        if board[i] is False:
            return False
    return True

def queen():
    global count
    if check_board(board_row):
        count+=1
        return
    i = -1
    for x in range(N):
        if board_row[x] is False:
            i = x
            break
    if i == -1:
        return
    availabe_column = [True]*N
    for j, val in enumerate(board_row):
        if val is not False:
            availabe_column[val]=False
            diff = abs(i - j)
            if val - diff >= 0:
                availabe_column[val - diff]=False
            if val + diff < N:
                availabe_column[val + diff]=False
    for k, val in enumerate(availabe_column):
        if val is True:
            board_row[i]=k

            queen()

            board_row[i]=False

queen()
print(count)