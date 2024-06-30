import sys
while True:
    c = sys.stdin.readline().strip()
    if not c:
        break
    a ,b = c.split()
    print(int(a)+int(b))