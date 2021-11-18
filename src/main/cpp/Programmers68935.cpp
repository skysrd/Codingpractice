// 3진법 뒤집기
#include <string>
#include <vector>

using namespace std;

int solution(int n) {
    int answer = 0;

    vector<int> tri;
    while(n!=0) {
        tri.push_back(n%3);
        n/=3;
    }

    for(int i=0; i<tri.size(); i++) {
        for(int j=0; j<tri.size()-i-1; j++) {
            tri[i]*=3;
        }
        answer+=tri[i];
    }

    return answer;
}