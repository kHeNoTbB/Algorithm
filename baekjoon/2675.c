#include <stdio.h>
#include <string.h>
int main() {
	int testcase = 0;
	scanf("%d", &testcase);
	int i = 0, j = 0, z = 0;

	for (i = 0; i < testcase; i++) {
	int R = 0;
	char S[20] = " ";
	scanf("%d %s", &R, &S);
	int len = strlen(S);

			for (j = 0; j < len; j++) { //길이만큼 
				for (z = 0; z < R; z++) {
					printf("%c", S[j]);
				}
			}
			printf("\n");
	}
	while (1);
}