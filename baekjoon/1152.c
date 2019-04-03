#include <stdio.h>
#include <string.h>
#define MAX 1000100
int main() {
	char a[MAX] = " ";
	int space=1;

	gets(a);
	//printf("%s\n", a);

	for (int i = 0; i < strlen(a); i++) {
		if (a[i] == ' ') space += 1;
	}

	if (a[0] == ' ') space -= 1;
	if (a[strlen(a)-1] == ' ') space -= 1;

	printf("%d", space);
	return 0;
}