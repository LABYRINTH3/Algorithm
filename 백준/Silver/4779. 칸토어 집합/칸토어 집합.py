import sys

input = sys.stdin.readline

def kantor(n)->str:
    if n == 0:
        return "-"
    kantor_prev = kantor(n-1)
    return kantor_prev + " " * (len(kantor_prev)) + kantor_prev

answer = []
while True:
    line = input().strip()
    if not line:
        break
    n = int(line)
    answer.append(kantor(n))

print("\n".join(answer))