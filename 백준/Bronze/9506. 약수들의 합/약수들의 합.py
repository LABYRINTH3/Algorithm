import sys
import math

output = []
while True:
    a = int(sys.stdin.readline())
    if a == -1:
        break

    sum = 1
    factor = [1,]
    for i in range(2, int(math.sqrt(a)) + 1):
        if a % i == 0:
            sum += i
            if i != a//i:
                sum += a//i
                factor.append(a//i)
            factor.append(i)
    
    factor.sort()
    if sum == a:
        b = str(factor[0])
        for i in range(1, len(factor)):
            b = b + " + " + str(factor[i])
        output.append(f"{a} = {b}")
    else:
        output.append(f"{a} is NOT perfect.")


print("\n".join(output))

        
