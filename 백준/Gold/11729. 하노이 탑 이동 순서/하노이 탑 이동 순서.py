import sys

input = sys.stdin.readline

move = []
def hanoi(n, start, rest, to):
    global count
    if n == 1:
        move_record = str(start) + " " + str(to)
        move.append(move_record)
        return 0
    hanoi(n-1, start, to, rest)
    move_record = str(start) + " " + str(to)
    move.append(move_record)
    hanoi(n-1, rest, start, to)
    # 3 1 2 3
    # 2 1 3 2

n = int(input())
hanoi(n, 1, 2, 3)
print(len(move))
print("\n".join(move))