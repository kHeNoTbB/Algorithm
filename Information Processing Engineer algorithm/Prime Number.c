#include <stdio.h>
#include <math.h>
void main() {
	int P = 2;
	int N = 3;
	while (1) {
		int M = (int)sqrt(double(N));
		for (int i = 2; i <= M; i++) {
			int R = N%i;
			if (R == 0) break;
			if(i == M)P = N;
		}
		N++;
		if (N > 100) break;
	}
	printf("%d\n", P);
}