import sys

input = sys.stdin.readline

def star(n) -> list:
    if n == 1:
        return ["***", "* *", "***"]
    stars = []
    stars_prev = star(n-1)
    for i in range(3):
        if i == 1:
            for s in stars_prev:
                stars.append(s + " " * len(s) + s)
        else:
            for s in stars_prev:
                stars.append(s * 3)
    return stars



n = int(input())
count = 0
while n!=1:
    n = n//3
    count += 1

answer = star(count)
print("\n".join(answer))