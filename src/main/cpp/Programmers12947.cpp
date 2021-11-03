// 하샤드 수
#include <string>
#include <vector>

using namespace std;

bool solution(int x) {
    string str = to_string(x);
    bool answer=false;
    int sum=0;

    for(int i=0; i<str.size(); i++) {
      sum+=(str[i]-'0');
    }

    if(x%sum==0) {
        answer=true;
    }
    else {
        answer=false;
    }

    return answer;
}