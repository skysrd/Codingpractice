//문자열 다루기 기본

#include <string>
#include <vector>

using namespace std;

bool solution(string s) {
    bool answer = true;

    if(s.size()==4||s.size()==6) {
    }
    else {
        answer=false;
        return answer;
    }

    for(int i=0; i<s.size(); i++) {
        if(s[i]>='0'&&s[i]<='9') {
            continue;
        }
        else {
            answer=false;
            return answer;
        }
    }

    return answer;
}