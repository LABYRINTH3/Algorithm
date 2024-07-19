#include <iostream>
#include <algorithm>
using namespace std;

int check(int *num, int sum){
    for (int i = 0; i < 8; ++i) {
        for (int j = i + 1; j < 9; ++j) {
            if (sum - num[i] - num[j] == 100){
                num[i] = -1;
                num[j] = -1;
                return 0;
            }
        }
    }

}

int main() {
    int num[9];
    int sum = 0;
    for (int & i : num) {
        cin >> i;
        sum += i;
    }
    check(num, sum);
    sort(num,num+9);
    for(int i = 2; i < 9; ++i) {
        cout << num[i] <<'\n';
    }
    return 0;
}
