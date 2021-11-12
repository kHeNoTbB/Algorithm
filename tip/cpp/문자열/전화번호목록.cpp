#include <string>
#include <vector>
#include <iostream>
#include <algorithm> //sort

using namespace std;

bool solution(vector<string> phone_book) {
    bool answer = true;

    //(1)정렬
    sort(phone_book.begin(), phone_book.end());
    
    //(2)비교
    for(int i=0; i<phone_book.size()-1; i++) {
        if(phone_book[i+1].find(phone_book[i]) == 0) {
            return false;
        }
    }
    return answer;
}
