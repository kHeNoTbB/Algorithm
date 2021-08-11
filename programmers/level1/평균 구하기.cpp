#include <string>
#include <vector>

using namespace std;

double solution(vector<int> arr) {
    double answer = 0;
    double total=0;
    int size=arr.size();
    for (vector<int>::iterator iter = arr.begin(); iter != arr.end(); iter++)
        total+=*iter;
    answer=total/size;
    return answer;
}