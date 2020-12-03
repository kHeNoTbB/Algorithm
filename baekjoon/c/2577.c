#include <stdio.h>
int main() {
	int A = 0, B = 0, C = 0;
	int mul = 0;
	char result[11] = { 0, };
	
	scanf("%d %d %d", &A, &B, &C);
	mul = A * B * C;
	//printf("%d\n", mul);
	
	while (mul > 0) {
		result[mul % 10]++;
		mul /= 10;
	}
	
	for (int i = 0; i < 10; i++)
		printf("%d\n", result[i]);
	return 0;
}