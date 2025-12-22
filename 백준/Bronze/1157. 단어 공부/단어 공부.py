string = input()

alphabet = [0] * 26
for i in range(len(string)):
    char = string[i].lower()
    alphabet[ord(char) - ord('a')] += 1

max_index = [i for i, count in enumerate(alphabet) if count == max(alphabet)]
if len(max_index) > 1:
    print('?')
else:
    print(chr(max_index[0] + ord('A')))