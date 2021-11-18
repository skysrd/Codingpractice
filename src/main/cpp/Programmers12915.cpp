// 문자열 내 마음대로 정렬하기
#include <string>
#include <vector>
#include <algorithm>
using namespace std;

bool compare(string a, string b, int n=2) {
    if(a.at(n)==b.at(n)) {
        return a < b;
    }
    else {
        return a.at(n) < b.at(n);
    }
}

vector<string> solution(vector<string> strings, int n) {
    vector<string> answer;

    for(int i=0; i<strings.size(); i++) {
        for(int j=0; j<strings.size(); j++) {
            if(compare(strings[i],strings[j],n)) {
                string temp = strings[i];
                strings[i]=strings[j];
                strings[j]=temp;
            }
        }
    }

    answer=strings;

    return answer;
}