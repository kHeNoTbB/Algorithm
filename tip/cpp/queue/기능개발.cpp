#include <string>
#include <vector>
#include <queue>

using namespace std;

vector<int> solution(vector<int> progresses, vector<int> speeds)
{
    vector<int> answer;
    queue<int> q;
    for (int i = 0; i < progresses.size(); i++)
    {
        int tmp = (100 - progresses[i]);
        if (tmp % speeds[i] == 0)
            q.push(tmp / speeds[i]);
        else
            q.push((tmp / speeds[i]) + 1);
    }

    int deployCnt = 1;
    int topDay = q.front();
    q.pop();
    while (!q.empty())
    {
        int nowDay = q.front();
        if (topDay >= nowDay)
            deployCnt++;
        else
        {
            topDay = nowDay;
            answer.push_back(deployCnt);
            deployCnt = 1;
        }
        q.pop();
    }
    answer.push_back(deployCnt);

    return answer;
}
