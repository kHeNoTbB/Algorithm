#include <stdio.h>

int main() {
	int ascending=0, descending=0, mixed=0;
	int a[8] = { 0, };
	for (int i = 0; i < 8; i++) {
		scanf("%d", &a[i]);
	}

	for (int i = 0; i < 7; i++) {
		if ((a[i + 1] - a[i]) != 1) break;
		else ascending++;
	}

	for (int i = 0; i < 7; i++) {
		if ((a[i] - a[i + 1]) != 1) break;
		else descending++;
	}

	//printf("%d %d %d\n", ascending, descending, mixed);
	if (ascending == 7) printf("ascending");
	else if (descending == 7) printf("descending");
	else printf("mixed");
	return 0;
}