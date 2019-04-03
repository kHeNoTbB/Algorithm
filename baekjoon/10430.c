#include <stdio.h>
int main() {
	int a = 0;
	int b = 0;
	int c = 0;
	scanf("%d %d %d", &a, &b, &c);
	if (a >= 2) {
		if (c <= 10000) {
			printf("%d\n", (a + b) % c);
			printf("%d\n", (a%c + b%c) % c);
			printf("%d\n", (a*b) % c);
			printf("%d", ((a%c) * (b%c)) % c);
		}
	}
	return 0;
}