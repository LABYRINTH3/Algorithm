def fibonacci(n):
    if n == 0:
        return 1, 0
    elif n == 1:
        return 0, 1
    
    prev_prev = (1, 0)
    prev = (0, 1)
    
    for i in range(2, n + 1):
        current = (prev[1], prev[0] + prev[1])
        prev_prev = prev
        prev = current
    
    return prev

n = int(input())
case = []
for i in range(0,n) :
    inputCase = int(input())
    case.append(inputCase)

# print(case)

for k in case :
    list_fib = []
    fib = fibonacci(k)
    list_fib.append(fib)
    print(fib[0], fib[1])
