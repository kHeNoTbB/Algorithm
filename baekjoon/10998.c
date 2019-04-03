#include <stdio.h>
int main() {
	int a, b;
	scanf("%d %d", &a, &b);
	if (a > 0) {
		if (b < 10) {
			printf("%d", a*b);
		}
	}
	return 0;
}