string = input()

sum = 0
for i in range(len(string)):
    if string[i] in ['A', 'B', 'C']:
        sum += 3
    elif string[i] in ['D', 'E', 'F']:
        sum += 4
    elif string[i] in ['G', 'H', 'I']:
        sum += 5
    elif string[i] in ['J', 'K', 'L']:
        sum += 6
    elif string[i] in ['M', 'N', 'O']:
        sum += 7
    elif string[i] in ['P', 'Q', 'R', 'S']:
        sum += 8
    elif string[i] in ['T', 'U', 'V']:
        sum += 9
    elif string[i] in ['W', 'X', 'Y', 'Z']:
        sum += 10
print(sum)