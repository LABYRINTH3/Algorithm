import sys
input = sys.stdin.readline

merge_count = 0
tmp = [0] * (10**6 + 1)
def merge_sort(A, p, r, m):
    global merge_count
    if p < r:
        q = (p + r)//2
        merge_sort(A, p, q, m)
        merge_sort(A, q+1, r, m)
        merge(A, p, q, r, m)

def merge(A, p, q, r, m):
    global merge_count
    i = p
    j = q + 1
    t = 1
    while(i<=q and j<=r):
        if(A[i]<=A[j]):
            tmp[t] = A[i]
            t = t + 1
            i = i + 1
        else:
            tmp[t] = A[j]
            t = t + 1
            j = j + 1
    while(i<=q):
        tmp[t] = A[i]
        t = t + 1
        i = i + 1
    while(j<=r):
        tmp[t] = A[j]
        t = t + 1
        j = j + 1
    i = p
    t = 1
    while(i<=r):
        A[i] = tmp[t]
        i += 1
        t += 1
        merge_count+=1
        if merge_count == m:
            print(A[i-1])
            exit(0)


n, m = map(int, input().split())
A = list(map(int, input().split()))

merge_sort(A, 0, n-1, m)

print(-1)


# # A[p..q]와 A[q+1..r]을 병합하여 A[p..r]을 오름차순 정렬된 상태로 만든다.
# # A[p..q]와 A[q+1..r]은 이미 오름차순으로 정렬되어 있다.
# merge(A[], p, q, r) {
#     i <- p; j <- q + 1; t <- 1;
#     while (i ≤ q and j ≤ r) {
#         if (A[i] ≤ A[j])
#         then tmp[t++] <- A[i++]; # tmp[t] <- A[i]; t++; i++;
#         else tmp[t++] <- A[j++]; # tmp[t] <- A[j]; t++; j++;
#     }
#     while (i ≤ q)  # 왼쪽 배열 부분이 남은 경우
#         tmp[t++] <- A[i++];
#     while (j ≤ r)  # 오른쪽 배열 부분이 남은 경우
#         tmp[t++] <- A[j++];
#     i <- p; t <- 1;
#     while (i ≤ r)  # 결과를 A[p..r]에 저장
#         A[i++] <- tmp[t++]; 
# }