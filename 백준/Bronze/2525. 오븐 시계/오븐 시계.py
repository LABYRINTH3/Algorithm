A, B = map(int,input().split())
time = int(input(""))
timeHour = time // 60
timeMinute = time % 60
A = A + timeHour
B = B + timeMinute
if B >= 60:
    B -= 60
    A += 1
if A >= 24:
    A -= 24
print(A, B)