#include <stdio.h>
int DP[12];
int main() {

	int N, num = 0;
	int T = 0;
	scanf("%d", &T);
	while (T--) {
		scanf("%d", &N);

		DP[1] = 1; DP[2] = 2; DP[3] = 4;

		for (int i = 4; i < N + 1; i++) {
			DP[i] = DP[i - 1] + DP[i - 2] + DP[i - 3];
		}
		
		printf("%d\n", DP[N]);
	}
	return 0;
}