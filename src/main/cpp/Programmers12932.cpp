// 자연수 뒤집어 배열로 만들기

#include <string>
#include <vector>
#include <algorithm>
using namespace std;

vector<int> solution(long long n) {
    vector<int> answer;

    for(int i=0; n>0; i++) {
        answer.push_back(n%10);
        n/=10;
    }

    return answer;
}