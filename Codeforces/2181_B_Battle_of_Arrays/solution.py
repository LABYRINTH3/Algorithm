import heapq
import sys

input = sys.stdin.readline

def battle_array(a, b):
    a_turn = True
    while len(a)!=0 and len(b)!=0:
        if a_turn:
            a_max = -a[0]
            b_max = -b[0]
            heapq.heappop(b)
            if a_max<b_max:
                b_new=b_max-a_max
                heapq.heappush(b, -b_new)
        else:
            a_max = -a[0]
            b_max = -b[0]
            heapq.heappop(a)
            if b_max<a_max:
                a_new=a_max-b_max
                heapq.heappush(a, -a_new)
        a_turn = not a_turn
    if len(a)==0:
        return "Bob"
    if len(b)==0:
        return "Alice"


t = int(input())
ans = []
for _ in range(t):
    n, m = map(int, input().split())
    a = list(map(int, input().split()))
    b = list(map(int, input().split()))
    a = [-x for x in a]
    b = [-x for x in b]
    heapq.heapify(a)
    heapq.heapify(b)
    ans.append(battle_array(a, b))

print(*ans, sep='\n')