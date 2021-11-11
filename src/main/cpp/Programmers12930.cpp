//이상한 문자 만들기

#include <string>
#include <vector>

using namespace std;

string solution(string s) {
    vector<string> vec;
    string answer = "";

    int temp=0;

    for(int i=0; i<s.size(); i++) {
        if(s[i]==' ') {
            temp=0;
            answer+=s[i];
            continue;
        }
        else if(temp%2==0) {
            if('a'<=s[i]&&s[i]<='z') {
                answer+=s[i]-32;
            }
            else {
                answer+=s[i];
            }
        }
        else if(temp%2==1) {
            if('A'<=s[i]&&s[i]<='Z') {
                answer+=s[i]+32;
            }
            else {
                answer+=s[i];
            }
        }
        temp++;
    }

    return answer;
}