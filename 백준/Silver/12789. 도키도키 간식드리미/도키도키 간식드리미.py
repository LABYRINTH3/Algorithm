import sys

n = int(sys.stdin.readline())
order = list(map(int, sys.stdin.readline().split()))

stack = []
num_ticket = 1

for student in order:
    # 현재 학생을 스택에 추가
    stack.append(student)
    
    # 스택의 맨 위 학생이 다음 번호표를 가지고 있다면 간식을 줌
    while stack and stack[-1] == num_ticket:
        stack.pop()
        num_ticket += 1

# 모든 학생이 간식을 받았는지 확인
if num_ticket == n + 1:
    print("Nice")
else:
    print("Sad")
