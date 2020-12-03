#include <stdio.h>
int main() {
	int a, b, c;
	scanf("%d %d %d", &a, &b, &c);
	
	if (a > b) {
		if (b < c) {
			if (a > c) printf("%d", c);
			else printf("%d", a);
		}
		else printf("%d", b);
	}

	else { //a < b, a==b
		if (b > c) {
			if (a > c) printf("%d", a);
			else printf("%d", c);
		}
		else printf("%d", b);
	}

	return 0;
}