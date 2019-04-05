#include <stdio.h>
void main() {
	char A[5][5] = { { 'A', 'B', 'C', 'D', 'E'},
					 { 'F', 'G', 'H', 'I', 'J' },
					 { 'K', 'L', 'M', 'N', 'O' },
				   	 { 'P', 'Q', 'R', 'S', 'T' },
					 { 'U', 'V', 'W', 'X', 'Y' } };
	char B[5][5];
	int N;
	for (int R = 0; R <= 4; R++) {
		for (int C = 0; C <= 4; C++) {
			N = 4 - R;
			B[C][N] = A[R][C];
		}
	}
	for (int R = 0; R <= 4; R++) {
		for (int C = 0; C <= 4; C++) {
			printf("%c\t", A[R][C]);
		}
		printf("\n");
	}
	printf("===================================\n");
	for (int C = 0; C <= 4; C++) {
		for (int N = 0; N <= 4; N++) {
			printf("%c\t", B[C][N]);
		}
		printf("\n");
	}
}