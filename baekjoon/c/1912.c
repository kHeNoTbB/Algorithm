#include <stdio.h> 
int number;
int order[100050];
int maxed = -987654321, download = 0;
int main() {
	scanf("%d", &number);
	for (int i = 1; i <= number; i++) {
		scanf("%d", &order[i]);
	}
	for (int j = 1; j <= number; j++) {
		download += order[j];
		if (maxed<download)
			maxed = download; 
		if (download <= 0) {
			download = 0;
		}
	}
	printf("%d", maxed);
	return 0;
}