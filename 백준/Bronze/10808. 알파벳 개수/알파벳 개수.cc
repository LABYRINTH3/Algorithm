#include <iostream>
#include <string>
#include <vector>

using namespace std;

int main(){
    string S;
    cin >> S;
    vector<int> count(26,0);

    for (char i : S) {
        count[i - 'a']++;
    }
    for (int i : count) {
        cout << i << ' ';
    }
    return 0;
}