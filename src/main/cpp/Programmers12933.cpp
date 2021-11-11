// 정수 내림차순으로 배치하기

#include <string>
#include <vector>
#include <algorithm>

using namespace std;

long long solution(long long n) {
    long long answer = 0;

    vector<long long> vec;

    for(int i=0; n>0; ++i) {
        vec.push_back(n%10);
        n=n/10;
    }

    sort(vec.begin(), vec.end());

    reverse(vec.begin(), vec.end());

    for(int i=0; i<vec.size(); i++) {
        for(int j=0; j<(vec.size()-i)-1; j++) {
            vec[i]*=10;
        }
        answer+=vec[i];
    }

    return answer;
}