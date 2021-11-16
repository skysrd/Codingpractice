// 두 개 뽑아서 더하기

#include <string>
#include <vector>
#include <algorithm>

using namespace std;

vector<int> solution(vector<int> numbers) {
    vector<int> answer;

    for(int i=0; i<numbers.size(); i++) {
        for(int j=i+1; j<numbers.size(); j++) {
            int temp = numbers[i]+numbers[j];
            int exists=0;
            for(int k=0; k<answer.size(); k++) {
                if(temp==answer[k]) {
                    exists=1;
                    continue;
                }
            }
            if(exists==0) {
                answer.push_back(temp);
            }
        }
    }

    sort(answer.begin(), answer.end());

    return answer;
}