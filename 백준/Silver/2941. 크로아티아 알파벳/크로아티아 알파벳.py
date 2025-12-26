string = input()
count = 0
index = 0
while index < len(string):
    if string[index:index+2] == 'c=':
        count += 1
        index += 2
    elif string[index:index+2] == 'c-':
        count += 1
        index += 2
    elif string[index:index+3] == 'dz=':
        count += 1
        index += 3
    elif string[index:index+2] == 'd-':
        count += 1
        index += 2
    elif string[index:index+2] == 'lj':
        count += 1
        index += 2
    elif string[index:index+2] == 'nj':
        count += 1
        index += 2
    elif string[index:index+2] == 's=':
        count += 1
        index += 2
    elif string[index:index+2] == 'z=':
        count += 1
        index += 2
    else:
        index += 1
        count += 1
print(count)
