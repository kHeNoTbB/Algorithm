#include <stdio.h>

int main() {
	int num=0;
	int i,sum = 0;
	if (num <= 10000)
		scanf("%d", &num);

	for (i = num; i > 0; i--) {
		sum = sum + i;
	}
	printf("%d", sum);
	return 0;
}