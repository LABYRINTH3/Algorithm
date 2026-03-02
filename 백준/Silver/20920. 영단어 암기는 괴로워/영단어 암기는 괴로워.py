import sys

input = sys.stdin.readline

n, m = map(int, input().split())

words = {}

for i in range(n):
    word = input().strip()
    if len(word) >= m:
        if word in words:
            words[word] += 1
        else:
            words[word] = 1

words = sorted(words.keys(), key=lambda x: (-words[x], -len(x), x))

for word in words:
    print(word)
