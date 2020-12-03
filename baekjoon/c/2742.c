#include <stdio.h>

int main() {
	int num=0;
	int i = 0;
	if (num <= 100000)
		scanf("%d", &num);

	for (i = num; i > 0; i--) {
		printf("%d\n", i);
	}
	return 0;
}