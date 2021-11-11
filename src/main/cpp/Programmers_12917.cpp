// 문자열 내림차순으로 배치하기

#include <string>
#include <vector>
#include <algorithm>

using namespace std;

string solution(string s) {
    string answer = "";

    vector<char> vec;

    for(int i=0; i<s.size(); i++) {
        vec.push_back(s[i]);
    }

    sort(vec.begin(), vec.end());

    reverse(vec.begin(), vec.end());

    for(int i=0; i<vec.size(); i++) {
        answer+=vec[i];
    }


    return answer;
}