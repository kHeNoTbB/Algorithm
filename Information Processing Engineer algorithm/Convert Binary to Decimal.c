#include <stdio.h>
#include <math.h>
void main() {
	int T[8] = { 1,1,1,1,0,1,1,0 };
	int C[8];
	int D = 0;
	int SIGN = 1;
	if (T[0] != 0) {
		SIGN = -1;
		int B = 1;
		for (int K = 7; K >= 1; K--) {
			C[K] = T[K] - B;
			if (T[K] != 0 || B != 1)
				B = 0;
			C[K] = abs(C[K]);
			T[K] = 1 - C[K];
		}
	}
	for (int K = 1; K <= 7; K++) {
		int T1 = (int)pow(2, (7 - (double)K));
		int T2 = T[K] * T1;
		D += T2;
	}
	D *= SIGN;
	printf("%d\n", D);

	return 0;
}