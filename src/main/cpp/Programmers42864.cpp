//체육복

#include <string>
#include <vector>

using namespace std;

int solution(int n, vector<int> lost, vector<int> reserve) {

    int answer=0;

    vector<int> vec(n,1);

    for(int i=0; i<lost.size(); i++) {
        vec[lost[i]-1]--;
    }
    for(int i=0; i<reserve.size(); i++) {
        vec[reserve[i]-1]++;
    }

    for(int i=0; i<vec.size(); i++) {
        if(vec[i]==0) {
            if(vec[i-1]==2) {
                vec[i-1]--;
                vec[i]++;
                continue;
            }
            else if(vec[i+1]==2) {
                vec[i+1]--;
                vec[i]++;
                continue;
            }
        }
    }

        for(int i=0; i<vec.size(); i++) {
       if(vec[i]>=1) {
        answer++;
       }
    }

    return answer;
}