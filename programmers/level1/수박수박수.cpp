#include <string>
#include <vector>
using namespace std;
string solution(int n) {
	string answer = "";
	if (n % 2 == 1) {
		int mok = n / 2;
		for (int i = 0; i < mok; i++) answer += "����";
		answer += "��";
	}
	if (n % 2 == 0) {
		int mok = n / 2;
		for (int i = 0; i < mok; i++) answer += "����";
	}
	return answer;
}