#include <stdio.h>
int main() {
	int i;
	char val[101];
	while(scanf("%10s", val)!=EOF)
		printf("%s\n", val);
	return 0;
}