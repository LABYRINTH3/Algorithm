import sys

MAX = 1000000

is_prime_bool_list = [True] * (MAX + 1)
is_prime_bool_list[0] = False
is_prime_bool_list[1] = False

for i in range(2, int(MAX**0.5) + 1):
    if is_prime_bool_list[i]:
        for j in range(i * i, MAX + 1, i):
            is_prime_bool_list[j] = False

is_prime_list = set()
for i in range(2, MAX + 1):
    if is_prime_bool_list[i]:
        is_prime_list.add(i)

n = int(sys.stdin.readline())

out = []
for _ in range(n):
    num = int(sys.stdin.readline())
    count = 0
    for i in range(2, num//2+1):
        if i in is_prime_list and num-i in is_prime_list:
            count+=1
    out.append(count)

print("\n".join(map(str, out)))