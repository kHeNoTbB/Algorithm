#include <stdio.h>

int main() {
	int N, a, b, i;
	char ch;
	scanf("%d", &N);

	for (i = 0; i < N; i++) {
		scanf("%d %c %d", &a, &ch, &b);
		printf("%d\n", a + b);
	}
	return 0;
}