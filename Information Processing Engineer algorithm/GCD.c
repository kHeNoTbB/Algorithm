#include <stdio.h>
void main() {
	int X = 60, Y = 124;
	if (X < Y) {
		int TEMP = X;
		X = Y;
		Y = TEMP;
	}
	for (;;) {
		int M = X%Y;
		if (M == 0) break;
		X = Y;
		Y = M;
	}
	printf("%d\n", Y);
	return 0;
}