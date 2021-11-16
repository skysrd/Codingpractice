// 같은 숫자는 싫어

#include <vector>
#include <iostream>
using namespace std;

vector<int> solution(vector<int> arr)
{
    vector<int> answer;
    answer.push_back(-1);
    for(int i = 0; i<arr.size(); i++) {
        if(arr[i]!=answer.back()) {
            answer.push_back(arr[i]);
        }
    }
    answer.erase(answer.begin());
    return answer;
}

