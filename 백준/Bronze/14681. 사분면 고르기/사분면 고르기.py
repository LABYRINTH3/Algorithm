num_x = int(input().strip())
num_y = int(input().strip())
if num_x > 0 and num_y > 0:
    print(1)
elif num_x < 0 and num_y > 0:
    print(2)
elif num_x < 0 and num_y < 0:
    print(3)
else:
    print(4)