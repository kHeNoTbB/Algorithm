#include <stdio.h>

int main() {
	int star=0;
	int i, j;
	
	if (star <= 100)
		scanf("%d", &star);

	for (i = 0; i < star; i++) {
		for (j = 0; j <= i; j++)
			printf("*");
		printf("\n");
	}

	return 0;

}