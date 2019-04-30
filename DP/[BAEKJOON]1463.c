#include <stdio.h>
int DP[1000001];
int main() {

	int N, min = 0;

	scanf("%d", &N);

	DP[1] = 0; DP[2] = 1; DP[3] = 1;

	for (int i = 4; i < N + 1; i++) {
		DP[i] = DP[i - 1] + 1; //-1
		if (i % 2 == 0) { min = DP[i / 2] + 1; if (min < DP[i]) DP[i] = min; }
		if (i % 3 == 0) { min = DP[i / 3] + 1; if (min < DP[i]) DP[i] = min; }
	}

	printf("%d", DP[N]);
	return 0;
}