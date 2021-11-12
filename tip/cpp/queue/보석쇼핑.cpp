#include <iostream>
#include <string>
#include <vector>
#include <map>
#include <set>
#include <queue>

using namespace std;

/*
    진열된 모든 종류의 보석을 적어도 1개 이상 포함하는 가장 짧은 구간을 찾아서 구매

*/
vector<int> solution(vector<string> gems)
{
    set<string> s;
    for (string gem : gems) {
        s.insert(gem);
    }

    queue<string> q;
    map<string, int> m;
    int tmpstartIdx = 0;
    int startIdx = 0;
    int len = gems.size();
    for (int i = 0; i < gems.size(); i++) {
        m[gems[i]]++;
        q.push(gems[i]);

        while (m[q.front()] > 1) {
            m[q.front()]--;
            q.pop();
            tmpstartIdx++;
        }
        //cout << m.size() << " ";

        //다 담았고 && 길이가 더 짧다면?
        if (m.size() == s.size() && len > i - tmpstartIdx) {
            len = i - tmpstartIdx;
            startIdx = tmpstartIdx + 1;
            //break; 뒤까지 다 해봐야 더 효율적인지 알 수 있음
        }
    }

    return {startIdx, startIdx+len};
}
