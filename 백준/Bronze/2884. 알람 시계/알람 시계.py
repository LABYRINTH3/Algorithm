num_hour, num_minute = map(int, input().strip().split())
if num_minute < 45:
    num_hour -= 1
    num_minute += 15
else:
    num_minute -= 45
if num_hour < 0:
    num_hour = 23
print(num_hour, num_minute)