//로또의 최고 순위와 최저 순위

#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> lottos, vector<int> win_nums) {
    vector<int> answer;
    int correct=0;
    int zeros=0;
    for(int i=0; i<lottos.size(); i++) {
        if(lottos[i]==0) {
            zeros++;
        }
        for(int j=0; j<win_nums.size(); j++) {
            if(lottos[i]==win_nums[j]) {
                correct++;
            }
        }
    }

    switch(correct+zeros) {
        default:
            answer.push_back(6);
            break;
        case 2:
            answer.push_back(5);
            break;
        case 3:
            answer.push_back(4);
            break;
        case 4:
            answer.push_back(3);
            break;
        case 5:
            answer.push_back(2);
            break;
        case 6:
            answer.push_back(1);
            break;
    }

    switch(correct) {
        default:
            answer.push_back(6);
            break;
        case 2:
            answer.push_back(5);
            break;
        case 3:
            answer.push_back(4);
            break;
        case 4:
            answer.push_back(3);
            break;
        case 5:
            answer.push_back(2);
            break;
        case 6:
            answer.push_back(1);
            break;
    }

    return answer;
}