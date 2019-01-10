#include <stdio.h>
int main() {
	int x = 0, cnt = 0;
	scanf("%d", &x);

	if (x < 100) printf("%d", x);
	
	else {
		cnt = 99;
		for (int i = 100; i <= x; i++) {
			int a = 0, b = 0, c = 0;
			a = i / 100;
			b = (i / 10) % 10;
			c = i % 10;

			if ((a - b) == (b - c)) cnt++;
		}
		printf("%d", cnt);
	}
	return 0;
}