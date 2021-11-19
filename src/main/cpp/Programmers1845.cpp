// 폰켓몬
#include <vector>
#include <map>
#include <algorithm>
using namespace std;

bool cmp(const pair<int, int>& a, const pair<int, int>& b) {
    if(a.second==b.second) {
        return a.first < b.first;
    }
    return a.second < b.second;
}

int solution(vector<int> nums)
{
    int answer = 0;

    map<int, int> map1;

    for(int i=0; i<nums.size(); i++) {
        map1[nums[i]]++;
    }

    for(int i=0; i<map1.size(); i++) {
        if(i<nums.size()/2) {
            answer++;
        }
        else {
            break;
        }
    }
    return answer;
}