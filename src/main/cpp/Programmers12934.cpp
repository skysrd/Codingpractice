// 정수 제곱근 판별
#include <string>
#include <vector>
#include <cmath>

using namespace std;

long long solution(long long n) {
    long long answer = 0;
    long double root = sqrt(n);
    if(root==(int)root) {
        answer=pow(root+1,2);
    }
       else {
           answer=(-1);
       }
    return answer;
}