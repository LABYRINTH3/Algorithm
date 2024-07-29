#include <iostream>
#include <vector>
using namespace std;

int main(){
    int a, b, c;
    vector<int> time(100,0);
    vector<int> truck(6,0);
    cin >> a >> b >> c;

    cin >> truck[0] >> truck[1];
    cin >> truck[2] >> truck[3];
    cin >> truck[4] >> truck[5];
//    for (int i : truck) {
//        cout << i << ' ';
//    }
//    cout << '\n';
    for (int i = truck[0]; i < truck[1] ; ++i) {
        time[i]++;
    }
    for (int i = truck[2]; i < truck[3] ; ++i) {
        time[i]++;
    }
    for (int i = truck[4]; i < truck[5] ; ++i) {
        time[i]++;
    }

    int sum = 0;
    for (int i : time) {
//        cout << i << ' ';
        if (i == 1) sum = sum + a;
        if (i == 2) sum = sum + b * 2;
        if (i == 3) sum = sum + c * 3;
    }
//    cout << '\n';
    cout << sum;

    return 0;
}

