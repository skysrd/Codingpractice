// 부족한 금액 계산하기

using namespace std;

long long solution(int price, int money, int count)
{
    long long answer = -1;

    long total=0;

    long longmoney=money;

    for(int i=0; i<count; i++) {
        total+=(price*(i+1));
    }

    if(total>longmoney) {
        answer=total-longmoney;
    }
    else {
        answer=0;
    }

    return answer;
}