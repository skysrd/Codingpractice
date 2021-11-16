// 약수의 개수와 덧셈
#include <string>
#include <vector>

using namespace std;

int divi(int a) {
    int answer=0;
    for(int i=1; i<=a; i++) {
        if(a%i==0) {
            answer++;
        }
    }
    return answer;
}

int solution(int left, int right) {
    int answer = 0;

    for(int i=left; i<=right; i++) {
        if(divi(i)%2==0) {
            answer+=i;
        }
        else {
            answer-=i;
        }
    }

    return answer;
}