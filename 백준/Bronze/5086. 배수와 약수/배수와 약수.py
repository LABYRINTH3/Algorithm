import sys

answer = []
while True:
    a, b = map(int, sys.stdin.readline().split())
    if a == 0 and b == 0:
        break
    elif a % b == 0:
        answer.append("multiple")
    elif b % a == 0:
        answer.append("factor")
    else:
        answer.append("neither")

print("\n".join(answer))