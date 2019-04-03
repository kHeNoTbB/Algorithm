#include <stdio.h>
void main() {
	int A[5][5] = { 0, };
	int V = 1;
	int M = 2;
	int CL = M, CR = M;
	for (int R = 0; R <= 4; R++) {
		for (int C = CL; C <= CR; C++) {
			A[R][C] = V;
			V += 2;
		}
		if (R < M) {
			CL--;
			CR++;
		}
		else {
			CL++;
			CR--;
		}
	}
	for (int R = 0; R < 5; R++) {
		for (int C = 0; C < 5; C++) {
			if (A[R][C] == 0) printf("\t");
			else printf("%d\t", A[R][C]);
		}
		printf("\n");
	}
}