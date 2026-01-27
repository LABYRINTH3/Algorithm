import sys

a_1, a_0 = map(int, sys.stdin.readline().split())
c = int(sys.stdin.readline())
n_0 = int(sys.stdin.readline())

if (c-a_1)*n_0 >= (a_0) and c >= a_1:
    print("1")
else:
    print("0")
