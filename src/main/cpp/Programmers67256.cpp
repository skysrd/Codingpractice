// 키패드 누르기
#include <string>
#include <vector>

using namespace std;

int getdistance(int start, int dest) {

    if(start>dest) {
        int temp = start;
        start=dest;
        dest=temp;
    }

    int distance=(dest-start)/3+(dest-start)%3;
    return distance;

}

string solution(vector<int> numbers, string hand) {

    string answer = "";

    int l=10;
    int r=12;

    for(int i=0; i<numbers.size(); i++) {
        if(numbers[i]%3==1) {
            answer+="L";
            l=numbers[i];
        }
        else if(numbers[i]%3==0&&numbers[i]>0) {
            answer+="R";
            r=numbers[i];
        }
        else {
            if(numbers[i]==0) {
                numbers[i]=11;
            }
            if(hand=="left") {
                if(getdistance(l,numbers[i])<=getdistance(r,numbers[i])) {
                    answer+="L";
                    l=numbers[i];
                }
                else {
                    answer+="R";
                    r=numbers[i];
                }
            }
            else if (hand=="right") {
                if(getdistance(l,numbers[i])>=getdistance(r,numbers[i])) {
                    answer+="R";
                    r=numbers[i];
                }
                else {
                    answer+="L";
                    l=numbers[i];
                }
            }
        }
    }

    return answer;
}