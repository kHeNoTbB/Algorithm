#include <string>
#include <vector>
#include <queue>

using namespace std;
bool visited[201];

void bfs(int r, vector<vector<int>> computers) {
    queue<int> q;
    q.push(r);

    while(!q.empty()) {
        int front = q.front();
        q.pop();

        for(int i=0; i<computers[front].size(); i++) {
            if(computers[front][i]==1 && visited[i]!=true) {
                visited[i] = true;
                q.push(i);
            }
        }

    }

}

int solution(int n, vector<vector<int>> computers) {
    int answer = 0;
    for(int i=0; i<n; i++){
        if(!visited[i]) {
            answer++;
            visited[i] = true;
            bfs(i, computers);
        }
    }
    return answer;
}

