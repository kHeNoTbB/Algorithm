#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
int main() {
	int n = 0, k = 0, sum=0;
	int money[11] = { 0, };
	
	scanf("%d %d", &n, &k);
	for (int i = 0; i < n; i++) scanf("%d", &money[i]);

	for (int i = n; i>0; i--) {
		sum += k / money[i];
		k %= money[i];
	}

	printf("%d", sum);

	return 0;
}