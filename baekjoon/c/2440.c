#include <stdio.h>

int main() {
	int star = 0;
	int i, j;

	if (star <= 100)
		scanf("%d", &star);

	for (i = star; i > 0; i--) {
		for (j = 1; j <= i; j++)
			printf("*");
		printf("\n");
	}

	return 0;

}