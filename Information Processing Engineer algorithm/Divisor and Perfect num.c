#include <stdio.h>
void main() {
	int TN = 0;
	for (int N = 4; N <= 500; N++) {
		int SUM = 0;
		int K = N / 2;
		for (int J = 1; J <= K; J++) {
			if (N%J == 0) SUM += J;
		}
		if (N == SUM) {
			printf("N=%d\n", N);
			TN++;
		}
	}
	printf("%d\n", TN);
}