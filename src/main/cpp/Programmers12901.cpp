//2016년
#include <string>
#include <vector>

using namespace std;

string solution(int a, int b) {
    int days[12]={31,29,31,30,31,30,31,31,30,31,30,31};
    int totday=4;

    for(int i=0; i<a-1; i++) {
        totday+=days[i];
    }
    totday+=b;

        string answer = "";

    if(totday%7==0)
        answer="SUN";
    else if(totday%7==1)
        answer="MON";
    else if(totday%7==2)
        answer="TUE";
    else if(totday%7==3)
        answer="WED";
    else if(totday%7==4)
        answer="THU";
    else if(totday%7==5)
        answer="FRI";
    else if(totday%7==6)
        answer="SAT";


    return answer;
}