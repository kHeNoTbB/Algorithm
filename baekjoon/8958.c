#include <stdio.h>
#include <string.h>

int main() {
	char ox[80] = { 0, };
	int testcase = 0, score = 0, sum=0;

	scanf("%d", &testcase);

	for(int i=0; i<testcase; i++) {
		sum = 0; score = 1;
		scanf("%s", &ox);
		int len = strlen(ox);


		for (int i = 0; i < len; i++) {
			if (ox[i] == 'O') {
				sum = sum + score; //1+2
				score++;
			}
			if (ox[i] == 'X') {
				score = 1; //0
			}
		}
		printf("%d\n", sum);
	}

	
	return 0;
}