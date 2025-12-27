num = int(input())

count = 0
for _ in range(num):
    string = input()
    alphabet = [0] * 26
    for i in range(len(string)):
        if alphabet[ord(string[i]) - ord('a')] > 0 and string[i] != string[i-1]:
            count -= 1
            # print(count)
            break
        alphabet[ord(string[i]) - ord('a')] += 1
    count += 1

print(count)