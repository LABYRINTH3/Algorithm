N, M = map(int, input().split())

answer = []
result = N
while (result > 0):
    remainder = result % M

    if remainder < 10:
        answer.append(str(remainder))
    else:
        answer.append(chr(ord('A') + remainder - 10))
    
    result //= M
answer.reverse()
print(''.join(answer))