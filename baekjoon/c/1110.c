#include<stdio.h> 
int main() {
	int N=0, N1=0 , count=0;
	scanf("%d", &N);
	N1 = N;
	int a = 0, b = 0, c = 0;
	while (1) {
		a = N / 10; 
		b = N % 10; 
		c = a + b; 
		N = b * 10 + c % 10;
		count++;
		if (N == N1) break;
	}
	printf("%d", count);
	return 0;
}