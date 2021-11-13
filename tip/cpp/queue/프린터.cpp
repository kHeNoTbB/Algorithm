#include <string>
#include <vector>
#include <queue>
#include <algorithm> //max_element

using namespace std;

int solution(vector<int> priorities, int location) {
    vector<int> answer;
    queue<int> q;
    
    for(int i=0; i<priorities.size(); i++) {
        q.push(i); //순서만 가지고 있음
    }

    while(!q.empty()) {
        int jIdx = q.front();
        q.pop();

        //j보다 중요한게 있는 경우?
        if( priorities[jIdx] != *max_element(priorities.begin(), priorities.end())) {
            q.push(jIdx); //대기목록 마지막으로 넣는다.
        } else {
            answer.push_back(jIdx);
            priorities[jIdx] = 0; //영향을 끼치면 안되므로 0으로 변경
        }
    }

    for(int idx : answer) {
        if(answer[idx] == location) return idx+1;
    }
    
    return 0;
}
