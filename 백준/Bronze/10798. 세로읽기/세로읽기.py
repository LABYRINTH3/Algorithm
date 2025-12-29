matrix = [input() for _ in range(5)]

result = ''
for i in range(15):
    for j in range(5):
        if i < len(matrix[j]):
           result += matrix[j][i]
print(result)