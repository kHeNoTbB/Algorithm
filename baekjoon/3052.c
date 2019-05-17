#include <stdio.h>
int main() {
	int a[11] = { 0, };
	int b[42] = { 0, };
	int c = 0;
	for(int i=0; i<10; i++) scanf("%d", &a[i]);
	for (int i = 0; i < 10; i++) b[a[i] % 42] = 1;


	for (int i = 0; i < 42; i++) {
		if (b[i] == 1) c++;
	}


	printf("%d", c);


	return 0;
}