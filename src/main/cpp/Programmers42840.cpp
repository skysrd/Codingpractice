//모의고사

#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> answers) {

    int ans1[]={1,2,3,4,5};
    int ans2[]={2,1,2,3,2,4,2,5};
    int ans3[]={3,3,1,1,2,2,4,4,5,5};

    int score[]={0,0,0};
    int max=0;
    for(int i=0; i<answers.size(); i++) {
        if(answers[i]==ans1[i%5]) {
            score[0]++;
            if(max<score[0]) {
                max=score[0];
            }
        }
        if(answers[i]==ans2[i%8]) {
            score[1]++;
            if(max<score[1]) {
                max=score[1];
            }
        }
        if(answers[i]==ans3[i%10]) {
            score[2]++;
            if(max<score[2]) {
                max=score[2];
            }
        }
    }
    vector<int> answer;

    for(int i=0; i<3; i++) {
        if(score[i]>=max) {
            answer.push_back(i+1);
        }
    }

    return answer;
}