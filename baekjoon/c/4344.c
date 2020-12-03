#include <stdio.h>
int main() {
	int c = 0, i=0, j=0, num=0;
	scanf("%d", &c);

	for (i = 0; i < c; i++) {
		scanf("%d", &num);
		int score[1001];
		int sum = 0;
		double average = 0;

		for (int j = 0; j < num; j++) {
			scanf("%d", &score[j]);
			sum += score[j];
		}

		average = (double)sum / num;
		int high = 0;
		for (int j = 0; j < num; j++) {
			if (average < score[j]) high++;
		}

		printf("%.3f%%\n", (double)high * 100 / num);
	}
	return 0;
}