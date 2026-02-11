import sys
from collections import deque

input = sys.stdin.readline

n = int(input())

d = deque()

out = []
for _ in range(n):
    order = list(map(int, input().split()))
    if order[0] == 1:
        d.appendleft(order[1])
    elif order[0] == 2:
        d.append(order[1])
    elif order[0] == 3:
        if len(d) == 0:
            out.append(-1)
        else:
            out.append(d.popleft())
    elif order[0] == 4:
        if len(d) == 0:
            out.append(-1)
        else:
            out.append(d.pop())
    elif order[0] == 5:
        out.append(len(d))
    elif order[0] == 6:
        out.append(1 if len(d) == 0 else 0)
    elif order[0] == 7:
        if len(d) == 0:
            out.append(-1)
        else:
            out.append(d[0])
    elif order[0] == 8:
        if len(d) == 0:
            out.append(-1)
        else:
            out.append(d[-1])

print("\n".join(map(str, out)))