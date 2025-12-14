N, M = map(int, input().split(" "))

buckets = [0] * (N + 1)

for _ in range(M):
    i, j, k = map(int, input().split(" "))
    for l in range(i, j+1):
        buckets[l] = k

for i in range(1, len(buckets)):
    print(buckets[i], end=" ")