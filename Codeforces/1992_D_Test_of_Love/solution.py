import sys

input = sys.stdin.readline

n = int(input())
ans = []

for _ in range(n):
    length, jump ,swim = map(int, input().split())
    way = ['0'] + list(input().strip()) + ['0']

    point = 0
    while point < length + 1:
        try:
            L_check = way.index("L", point + 1)
            if L_check-point <= jump:
                point = L_check
            else:
                if way[point + jump] == "C":
                    ans.append("No")
                    break

                need = L_check-point-jump

                try:
                    way.index("C", point+jump+1, L_check)
                    ans.append("No")
                    break
                except ValueError:
                    if swim < need:
                        ans.append("No")
                        break
                    swim -= need
                    point = L_check

        except ValueError:
            if length+1-point <= jump:
                ans.append("Yes")
                break
            else:
                if way[point + jump] == "C":
                    ans.append("No")
                    break
                need = length+1-point-jump
                try:
                    c_check = way.index("C", point+jump+1, length+1)
                    ans.append("No")
                    break
                except ValueError:
                    if swim<need:
                        ans.append("No")
                        break
                    else:
                        ans.append("Yes")
                        break
print(*ans, sep="\n")