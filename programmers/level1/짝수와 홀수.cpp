#include <string>
#include <cstdlib>


using namespace std;

string solution(int num) {
    string answer = "";
    if(abs(num)%2==0) answer+="Even";
    else if(abs(num)%2==1)answer+="Odd";
    return answer;
}