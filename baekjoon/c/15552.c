#include <stdio.h>
int main() {
	int T = 0, i = 0;
	scanf("%d", &T);
	for (i = 0; i < T; i++) {
		int a = 0, b = 0;
		scanf("%d %d", &a, &b);
		printf("%d\n", a + b);
	}
	return 0;
}