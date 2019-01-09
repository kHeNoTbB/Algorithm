#include <stdio.h>
int main() {
	int i, num;
	scanf("%d", &num);
	
	if (num < 10) {
		for (i = 1; i < 10; i++) {
			printf("%d * %d = %d\n", num, i, num*i);
		}
	}
	return 0;
}