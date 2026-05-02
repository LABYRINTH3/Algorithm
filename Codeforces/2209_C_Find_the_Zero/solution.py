import sys

input = sys.stdin.readline
flush = sys.stdout.flush

t = int(input())


def find_the_zero(n:int):
    for i in range(n-1):
        print(f"? {i*2+1} {i*2+2}")
        sys.stdout.flush()

        response = int(input())

        if response==1:
            return f"! {i*2+1}"

    print(f"? {1} {n*2-1}")
    sys.stdout.flush()
    response1 = int(input())
    if response1==1:
        return f"! 1"

    print(f"? {2} {n*2-1}")
    sys.stdout.flush()
    response2 = int(input())
    if response2==1:
        return f"! 2"

    # 0 2 0 3 0 4
    # 0 1 2 3 0 0
    return f"! {2*n}"

for _ in range(t):
    n = int(input())
    print(find_the_zero(n))
    sys.stdout.flush()