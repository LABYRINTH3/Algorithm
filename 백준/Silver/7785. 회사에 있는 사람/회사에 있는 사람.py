import sys

n = int(sys.stdin.readline())

log: dict[str, bool] = {}
for _ in range(n):
    name, status = map(str, sys.stdin.readline().split())
    if status == 'enter':
        log[name] = True
    else:
        log[name] = False

out = []
for name, status in log.items():
    if status:
        out.append(name)

out.sort(reverse=True)

print("\n".join(out))