//시저 암호

#include <string>
#include <vector>

using namespace std;

string solution(string s, int n) {
    string answer = "";

    for(int i=0; i<s.size(); i++) {
        if(s[i]==' ') {
            answer+=' ';
        }
        else if ('a'<=s[i]&&s[i]<='z') {
            if(s[i]+n>'z') {
                answer+=s[i]+n-26;
            }
            else {
                answer+=s[i]+n;
            }
        }
        else if ('A'<=s[i]&&s[i]<='Z') {
            if(s[i]+n>'Z') {
                answer+=s[i]+n-26;
            }
            else {
                answer+=s[i]+n;
            }
        }
    }

    return answer;
}
