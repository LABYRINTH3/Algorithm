def get_grade(string):
    if string == 'A+':
        return 4.5
    elif string == 'A0':
        return 4.0
    elif string == 'B+':
        return 3.5
    elif string == 'B0':
        return 3.0
    elif string == 'C+':
        return 2.5
    elif string == 'C0':
        return 2.0
    elif string == 'D+':
        return 1.5
    elif string == 'D0':
        return 1.0
    elif string == 'F':
        return 0.0
    else:
        return 0.0

string_matrix = []
for i in range(20):
    string_matrix.append(input().strip().split())

grade_sum = 0
credit_sum = 0
for i in range(len(string_matrix)):
    if string_matrix[i][2] != 'P':
        grade_sum += get_grade(string_matrix[i][2]) * float(string_matrix[i][1])
        credit_sum += float(string_matrix[i][1])

print(grade_sum / credit_sum)    