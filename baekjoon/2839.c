#include <stdio.h>
int main() {
	int N = 0;
	int box=0;
	scanf("%d", &N);

	while (1) {
		if (N % 5 == 0) {
			box = box + N / 5;
			printf("%d", box);
			break;
		}

		else {
			N = N - 3;
			if (N < 0) {
				printf("-1");
				break;
			}
			box++;
		}
	}
	return 0;
}