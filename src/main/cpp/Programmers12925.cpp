// 문자열을 정수로 바꾸기

#include <string>
#include <vector>

using namespace std;

int solution(string s) {
    int answer = 0;

    if(s[0]!='-'&&s[0]!='+') {
        for(int i=0; i<s.size(); i++) {
            int temp = s[i]-'0';

            for(int j=0; j<s.size()-i-1; j++) {
                temp*=10;
            }

            answer+=temp;
        }

    }
    else if(s[0]=='-') {
        for(int i=1; i<s.size(); i++) {
            int temp = s[i]-'0';

            for(int j=0; j<s.size()-i-1; j++) {
                temp*=10;
            }

            answer+=temp;
        }
        answer*=-1;
    }
    else {
        for(int i=1; i<s.size(); i++) {
            int temp = s[i]-'0';

            for(int j=0; j<s.size()-i-1; j++) {
                temp*=10;
            }

            answer+=temp;
        }
    }

    return answer;
}