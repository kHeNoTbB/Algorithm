#include <stdio.h>
int fac(int a) {
	if (a == 0) return 1;
	else return a * fac(a - 1);
}
int main() {
	int N=0, K = 0;
	scanf("%d %d", &N, &K);

	int result=fac(N) / (fac(K) * fac(N - K));
	printf("%d", result);

	return 0;
}