string = input()

check = 1
for i in range(len(string)):
    if string[i] == string[-i-1]:
        continue
    else:
        check = 0
        break

print(check)