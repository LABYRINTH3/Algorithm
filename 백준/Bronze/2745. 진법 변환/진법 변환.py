N, M = map(str, input().split())

M = int(M)
result = 0
for i in range(len(N)):
    if N[i] in ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9']:
        result += int(N[i]) * (M ** (len(N) - i - 1))
    else:
        result += (ord(N[i]) - 55) * (M ** (len(N) - i - 1))
print(result)