#include <stdio.h>
int dn(int n) {
	int k = n; 
	while (1) {
		if (n < 1) break;
		k += n % 10; 
		n /= 10; 
	}
	return k; 
}
int main() {
	int list[10100] = { 0, };

	for (int i = 1; i <= 10000; i++) {
		list[dn(i)] = 1; 
		if (list[i] == 0) printf("%d\n", i);
	}
	return 0;
}