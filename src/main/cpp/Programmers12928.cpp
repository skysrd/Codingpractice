//약수의 합

#include <string>
#include <vector>

using namespace std;

int solution(int n) {
    int answer = 0;

    for(int i=0; i<=n; i++) {
        for(int j=0; j<=n; j++) {
            if(i*j==n) {
                answer+=i;
            }
        }
    }
    return answer;
}

