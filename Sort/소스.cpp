#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
int main() {
	int pay = 0, sum = 0;
	int coin[] = { 500, 100, 50, 10, 5, 1 };

	scanf("%d", &pay);
	pay = 1000 - pay;

	for (int i = 0; i < 6; i++) {
		sum += pay / coin[i];
		pay = pay% coin[i];
	}

	printf("%d", sum);
	while (1);
}