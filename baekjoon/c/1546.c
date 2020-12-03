#include <stdio.h>
int main() {
	int N=0, i = 0, a = 0, A[1001];
	double  MAX = 0, sum = 0;

	scanf("%d", &N);
	for (i = 0; i < N; i++) {
		scanf("%d", &A[i]);
		if (A[i] > MAX) MAX = A[i];
	}

	for (i = 0; i < N; i++) {
		sum += (double)A[i] / (double)MAX * 100;
	}
	printf("%.4lf", (double)(sum / N));

	return 0;
}