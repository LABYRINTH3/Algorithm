#include <iostream>
#include <string>
using namespace std;

int main() {
    string S;
    cin >> S;
    int a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,i=0,j=0,k=0,l=0,m=0,n=0,o=0,p=0,q=0,r=0,s=0,t=0,u=0,v=0,w=0,x=0,y=0,z=0;
    for (int num = 0; num < S.size(); ++num) {
        if (S[num] == 'a') a++;
        if (S[num] == 'b') b++;
        if (S[num] == 'c') c++;
        if (S[num] == 'd') d++;
        if (S[num] == 'e') e++;
        if (S[num] == 'f') f++;
        if (S[num] == 'g') g++;
        if (S[num] == 'h') h++;
        if (S[num] == 'i') i++;
        if (S[num] == 'j') j++;
        if (S[num] == 'k') k++;
        if (S[num] == 'l') l++;
        if (S[num] == 'm') m++;
        if (S[num] == 'n') n++;
        if (S[num] == 'o') o++;
        if (S[num] == 'p') p++;
        if (S[num] == 'q') q++;
        if (S[num] == 'r') r++;
        if (S[num] == 's') s++;
        if (S[num] == 't') t++;
        if (S[num] == 'u') u++;
        if (S[num] == 'v') v++;
        if (S[num] == 'w') w++;
        if (S[num] == 'x') x++;
        if (S[num] == 'y') y++;
        if (S[num] == 'z') z++;
    }
    cout << a <<' '<< b <<' '<< c <<' '<< d <<' '<< e <<' '<< f <<' '<< g <<' '<< h <<' '<< i <<' '<< j <<' '<< k <<' '<< l <<' '<< m <<' '<< n <<' '<< o <<' '<< p <<' '<< q <<' '<< r <<' '<< s <<' '<< t <<' '<< u <<' '<< v <<' '<< w <<' '<< x <<' '<< y <<' '<< z;
    return 0;
}
