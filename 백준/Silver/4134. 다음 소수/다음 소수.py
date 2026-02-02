import sys

def is_prime(n: int) -> bool:
    if n < 2:
        return False
    for i in range(2, int(n**0.5) + 1):
        if n % i == 0:
            return False
    return True

def next_prime(n: int) -> int:
    while True:
        if is_prime(n):
            return n
        n += 1

iteration = int(sys.stdin.readline())

out = []
for _ in range(iteration):
    n = int(sys.stdin.readline())
    out.append(next_prime(n))

print("\n".join(map(str, out)))