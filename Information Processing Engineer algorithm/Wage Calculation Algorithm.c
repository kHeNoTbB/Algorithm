#include <stdio.h>
void main() {
	int P[9] = { 0 };
	int T[9] = { 0 };
	int C = 532263;
	int R = C;
	int M = 10000;
	int SW = 1;

	for (int K = 0; K < 9; K++) {
		P[K] = R / M;
		T[K] = T[K] + P[K];
		R = R - (P[K] * M);
		if (SW == 1) {
			M = M / 2;
			SW = 0;
		}
		else {
			M = M / 5;
			SW = 1;
		}
	}
	printf("10000\\\t 5000\\\t 1000\\\t 500\\\t 100\\\t 50\\\t 10\\\t 5\\\t 1\\\n");
	printf("----------------------------------------------------------------------\n");
	for (int i = 0; i < 9; i++) printf("%d\t", P[i]);
	printf("\n");
	return 0;
}