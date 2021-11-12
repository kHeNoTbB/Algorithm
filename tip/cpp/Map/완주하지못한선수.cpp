#include <string>
#include <vector>
#include <map>
#include <iostream>
#include <cstdio>

using namespace std;

string solution(vector<string> participant, vector<string> completion) {
    string answer = "";

    //(1) Map 선언하기
    map<string,int> map;

    //(2) 참가자들 Map에 <이름, 몇 명인지> 담기
    for(string name : participant) {
        map[name]++;
    }

    //(3) 참가자 중에서 완주한 사람 숫자 빼기
    for(string name : completion) {
        map[name]--;
    }
    
    //(4) 완주하지 못한 사람은?
    for(string name : participant){
        if(map[name]>0) {
            answer = name;
        }
    }

    return answer;
}
