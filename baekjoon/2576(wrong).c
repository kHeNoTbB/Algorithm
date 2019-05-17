#include <stdio.h>
#include <algorithm>
int main() {
	int a[8] = { 0, };
	int sum = 0;
	int min = 0;
	for(int i=0; i<7; i++)	scanf("%d", &a[i]);

	std::sort(a, a + 7);

	for (int i = 0; i < 7; i++)
		if (a[i] % 2 == 1) sum += a[i];
	printf("%d\n", sum);

	for (int i = 0; i < 7; i++) {
		if (a[i] % 2 == 1) {
			printf("%d\n", a[i]);
			break;
		}
		if (i == 6 && a[i] % 2 == 0) printf("-1");
	}


	return 0;
}