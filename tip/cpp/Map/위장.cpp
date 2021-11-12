#include <string>
#include <vector>
#include <unordered_map>

using namespace std;

/*
    input : clothes
    [["yellowhat", "headgear"], 
    ["bluesunglasses", "eyewear"], 
    ["green_turban", "headgear"]]

    headgear : yellowhat, green_turban, 안입는경우
    eyewear : bluesunglasses, 안입는 경우
    따라서 3*2 -1(모두 안입을 경우) = 5개
*/
int solution(vector<vector<string>> clothes) {
    int answer = 1;

    unordered_map<string, int> map;
    for(int i=0; i<clothes.size(); i++) {
        map[clothes[i][1]]++;
    }

    for(auto m : map) {
        answer*=(m.second+1);
    }

    return answer-1;
}
