import sys

output = []
while True:
    a, b, c = map(int, sys.stdin.readline().split())

    if a == 0 and b == 0 and c == 0:
        break
    elif a == b == c:
        output.append("Equilateral")
    elif max(a, b, c) >= (a + b + c - max(a, b, c)):
        output.append("Invalid")
    elif a == b or a == c or b == c:
        output.append("Isosceles")
    else:
        output.append("Scalene")

print("\n".join(output))
