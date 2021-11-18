//완주하지 못한 선수
#include <string>
#include <vector>

using namespace std;

string solution(vector<string> participant, vector<string> completion) {
    string answer = "";

    for(int i=0; i<participant.size(); i++) {
        for(int j=0; j<completion.size(); j++) {
            if(participant[i]==completion[j]) {
                participant[i]="0";
                completion[j]="0";
                continue;
            }
        }
        if(participant[i]!="0") {
            answer+=participant[i];
        }
    }

    return answer;
}