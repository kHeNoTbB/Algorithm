#include <stdio.h>
int main() {
	int n;
	scanf("%d", &n);
	int s = 1;
	for (int i = 1; i < n+1; i++) {
		int b = n-i; //3
		for (; b > 0; b--) { printf(" "); }
		for(int j=s; j>0; j--){ printf("*"); }
		printf("\n");
		s += 2;
	}
	return 0;
}