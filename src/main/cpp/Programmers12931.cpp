// 자릿수 더하기
#include <iostream>

using namespace std;
int solution(int n)
{
    int answer = 0;

    for(int i=0; n>0; i++) {
        answer+=n%10;
        n/=10;
    }

    return answer;
}