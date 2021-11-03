//최대공약수와 최소공배수
#include <string>
#include <vector>
#include <iostream>
using namespace std;


int gcd (int a, int b) {
    if(a<b) {
        int temp = a;
        a = b;
        b = temp;
    }

    while(b!=0) {
        int c = a%b;
        a=b;
        b=c;
    }

    return a;
}

int lcm (int a, int b) {
    return (a*b)/gcd(a,b);
}

int main() {

int n,m;
    cin>>n>>m;


    cout<<gcd(n,m)<<endl<<lcm(n,m);


    return 0;
}
