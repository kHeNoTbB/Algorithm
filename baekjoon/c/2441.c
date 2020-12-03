#include <stdio.h>
int main() {
	int N = 0;
	int i = 0;
	int j = 0;

	scanf("%d", &N);

	for (i = 0; i < N; i++) {
		for (j = 0; j < i; j++)
			printf(" ");
		for (j = 0; j <N-i; j++)
			printf("*");
		printf("\n");
	}
	return 0;
}