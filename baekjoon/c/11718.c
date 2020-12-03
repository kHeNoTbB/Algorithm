#include <stdio.h>
int main() {
	char A[101];
	
	while (gets(A)) {
		if (A[0] == '\0') break;
		puts(A);
	}
	return 0;
}