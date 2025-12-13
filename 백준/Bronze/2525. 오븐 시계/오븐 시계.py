num_hour, num_minute = map(int, input().strip().split())
num_cook_time = int(input().strip())
[num_hour, num_minute] = [num_hour + num_cook_time // 60, num_minute + num_cook_time % 60]
if num_minute >= 60:
    num_hour += 1
    num_minute -= 60
if num_hour >= 24:
    num_hour -= 24
print(num_hour, num_minute)