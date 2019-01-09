#include <stdio.h>
int main() {
	int N = 0;
	int X = 0;
	int i;

	scanf("%d %d", &N, &X);
	int *arr = (int*)malloc(sizeof(int)*N);

	for (i = 0; i < N; i++)
		scanf("%d", &arr[i]);

	for (i = 0; i < N; i++) {
		if (arr[i] < X) printf("%d ", arr[i]);
	}
	free(arr);
	return 0;
}