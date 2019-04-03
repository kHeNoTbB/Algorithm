#include <stdio.h>
void main() {
	int A[5][5] = { 0, };
	int V = 1;
	int M = 3;
	for (int R = 0; R < M; R++) {
		for (int C = R; C < (5 - R); C++) {
			A[R][C] = V;
			V++;
		}
	}

	for (int R = M; R <= 4; R++) {
		for (int C = (4 - R); C <= R; C++) {
			A[R][C] = V;
			V++;
		}
	}
	for (int R = 0; R < 5; R++) {
		for (int C = 0; C < 5; C++) {
			if (A[R][C] == 0) printf(" \t");
			else printf("%d\t", A[R][C]);
		}

		printf("\n");
	}
}