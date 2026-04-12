import sys

input = sys.stdin.readline

n = int(input())

fibcount = 0
fibonacci_count = 0

def fib(n):
    global fibcount
    if n == 1 or n == 2:
        fibcount += 1
        return 1
    else:
        return fib(n - 1) + fib(n - 2)


# list_fib = [1] * (n + 1)

# def fibonacci(n):
#     global fibonacci_count
#     for i in range(3, n + 1):
#         list_fib[i] = list_fib[i - 1] + list_fib[i - 2]
#         fibonacci_count += 1
#     return list_fib[n]


fib(n)
# fibonacci(n)

print(f"{fibcount} {n - 2}")

# fib(n) {
#     if (n = 1 or n = 2)
#     then return 1;  # 코드1
#     else return (fib(n - 1) + fib(n - 2));
# }
# 피보나치 수 동적 프로그래밍 의사 코드는 다음과 같다.

# fibonacci(n) {
#     f[1] <- f[2] <- 1;
#     for i <- 3 to n
#         f[i] <- f[i - 1] + f[i - 2];  # 코드2
#     return f[n];
# }