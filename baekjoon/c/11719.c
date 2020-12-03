#include <stdio.h>
int main() {
	char A[101];
	
	while (fgets(A,100,stdin)) {
		if (A[0] == '\0') break;
		fputs(A, stdout);
	}
	return 0;
}