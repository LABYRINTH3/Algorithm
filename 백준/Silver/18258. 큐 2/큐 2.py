import sys
from collections import deque

input = sys.stdin.readline

n = int(input())

queue = deque()

out = []
for _ in range(n):
    action = input().split()
    if action[0] == 'push':
        queue.append(action[1])
    elif action[0] == 'pop':
        if len(queue) == 0:
            out.append(-1)
        else:
            out.append(queue.popleft())
    elif action[0] == 'size':
        out.append(len(queue))
    elif action[0] == 'empty':
        out.append(1 if len(queue) == 0 else 0)
    elif action[0] == 'front':
        if len(queue) == 0:
            out.append(-1)
        else:
            out.append(queue[0])
    elif action[0] == 'back':
        if len(queue) == 0:
            out.append(-1)
        else:
            out.append(queue[-1])

print("\n".join(map(str, out)))