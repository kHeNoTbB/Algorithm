#include <stdio.h>
int main() {
	int T;
	int i;
	scanf("%d", &T);
	
	int A[T], B[T];

	for (i = 0; i < T; i++)
		scanf("%d %d", &A[i], &B[i]);
	for (i = 0; i < T; i++)
		printf("%d\n", A[i]+B[i]);
	return 0;
}