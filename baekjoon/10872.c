#include <stdio.h>
int main() {
	int n=0, m=1;
	scanf("%d", &n);

	if (n == 0) printf("1");
	else {
		for (int i = 1; i <= n; i++)
			m *= i; // m = m * i = 1* 1 * 2
		printf("%d", m);
	}
	return 0;
}