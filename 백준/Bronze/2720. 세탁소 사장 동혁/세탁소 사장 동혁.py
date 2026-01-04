count = int(input().strip())

output = []
for i in range(count):
    money = int(input().strip())
    q = money // 25
    money = money % 25
    d = money // 10
    money = money % 10
    n = money // 5
    money = money % 5
    p = money
    string = q, d, n, p
    output.append(string)

for row in output:
    print(' '.join(map(str, row)))