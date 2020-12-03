#include <stdio.h>
int main() {
	int score[5][4];
	int sum[5] = { 0, };
	int max = 0;
	int num = 0;
	
	for (int i = 0; i < 5; i++) {
		for (int j = 0; j < 4; j++) {
			scanf("%d", &score[i][j]);
		}
	}
	
	for (int i = 0; i < 5; i++) {
		for (int j = 0; j < 4; j++) {
			sum[i] = sum[i] + score[i][j];
		}
	}

	for (int i = 0; i < 5; i++) {
		if (max < sum[i]) {
			max = sum[i];
			num = i+1;
		}
	}

	printf("%d %d", num, max);

	return 0;
}