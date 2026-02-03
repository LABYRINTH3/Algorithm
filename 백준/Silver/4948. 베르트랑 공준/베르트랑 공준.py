import sys

MAX = 123456 * 2

def count_prime(n: int) -> int:
    count = 0
    for i in range(n + 1, 2 * n + 1):
        if is_prime_list[i]:
            count += 1
    return count

is_prime_list = [True] * (MAX + 1)
is_prime_list[0] = False
is_prime_list[1] = False

for i in range(2, int(MAX**0.5) + 1):
    if is_prime_list[i]:
        for j in range(i * i, MAX + 1, i):
            is_prime_list[j] = False

out = []
while True:
    n = int(sys.stdin.readline())
    if n == 0:
        break
    out.append(count_prime(n))

print("\n".join(map(str, out)))

    