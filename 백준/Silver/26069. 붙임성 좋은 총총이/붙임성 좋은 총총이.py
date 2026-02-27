import sys

input = sys.stdin.readline


dance = set()
dance.add("ChongChong")
n = int(input())

for _ in range(n):
    p1, p2 = map(str, input().strip().split())
    # print(p1, p2)

    if (p1 in dance) or (p2 in dance):
        dance.add(p1)
        dance.add(p2)
        # print(dance)
print(len(dance))