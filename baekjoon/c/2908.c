#include <stdio.h>
int main() {
	int a = 0, b = 0;
	scanf("%d %d", &a, &b);

	int a1 = a / 100;
	int a2 = (a % 100) / 10;
	int a3 = a % 10;
	a = a3 * 100 + a2 * 10 + a1;

	int b1 = b / 100;
	int b2 = (b % 100) / 10;
	int b3 = b % 10;
	b = b3 * 100 + b2 * 10 + b1;

	if (a > b) printf("%d", a);
	else printf("%d", b);

	return 0;
}