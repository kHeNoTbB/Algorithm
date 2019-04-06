#include <stdio.h>
void main() {
	int E[5] = { 95, 75, 85, 100, 50 };
	int i = 0;
	int temp;
	do {
		int j = 0;
		do {
			if (E[j] > E[j + 1]) {
				temp = E[j];
				E[j] = E[j + 1];
				E[j + 1] = temp;
			} 
			j++;
		} while (j < 4 - i);
		i++;
	} while (i < 4);

	for (int i = 0; i < 5; i++) printf("%d\t", E[i]);
	printf("\n");
}