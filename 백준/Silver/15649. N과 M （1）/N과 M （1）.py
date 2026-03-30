import sys

input = sys.stdin.readline

N, M = map(int, input().split())
check = [False]*(N+1)
path = []

def track():
    if len(path)==M:
        print(' '.join(map(str, path)))
        return
    for i in range(1, N+1):
        # print("i값", i)
        if not check[i]:
            path.append(i)
            check[i] = True

            track()

            path.pop()
            check[i] = False

track()
