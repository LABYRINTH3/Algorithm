import sys

input = sys.stdin.readline

n = int(input())

chat = set()
count = 0
for i in range(n):
    message = input().strip()
    if message == "ENTER":
        chat.clear()
    else:
        if message not in chat:
            chat.add(message)
            count += 1

print(count)