//제일 작은 수 제거하기
#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> arr) {
    vector<int> answer;
    int min;
    int minidx;
    for(int i=0; i<arr.size(); i++) {
        if(i==0) {
            min=arr[i];
        }
        else {
            if(min>arr[i]) {
                min=arr[i];
                minidx=i;
            }
        }
    }
    for(int i=0; i<arr.size(); i++) {
        if(i!=minidx) {
            answer.push_back(arr[i]);
        }
    }

    if(answer.size()==1) {
        answer[0]=(-1);
    }

    return answer;
}