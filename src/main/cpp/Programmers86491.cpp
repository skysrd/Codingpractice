// 최소직사각형

#include <string>
#include <vector>

using namespace std;


int solution(vector<vector<int>> sizes) {
    int answer = 0;

    int xpeak=0;
    int ypeak=0;

    for(int i=0; i<sizes.size(); i++) {
        int xsize=sizes[i][0];
        int ysize=sizes[i][1];

        if(xsize<ysize) {
            int temp = xsize;
            xsize=ysize;
            ysize=temp;
        }

        if(xsize>xpeak) {
            xpeak=xsize;
        }
        if(ysize>ypeak) {
            ypeak=ysize;
        }

    }

    answer=xpeak*ypeak;

    return answer;
}