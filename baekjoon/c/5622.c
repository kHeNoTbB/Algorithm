#include <stdio.h>
#include <string.h>

int main() {
	char dial[20];
	scanf("%s", &dial);

	int i = 0;
	int sec = 0;
	int len = 0;
	len = strlen(dial);

	for (i = 0; i < len; i++) {
		if (('A' <= dial[i]) && (dial[i] <= 'C')) sec += 3;
		else if (('D' <= dial[i]) && (dial[i] <= 'F')) sec += 4;
		else if (('G' <= dial[i]) && (dial[i] <= 'I')) sec += 5;
		else if (('J' <= dial[i]) && (dial[i] <= 'L')) sec += 6;
		else if (('M' <= dial[i]) && (dial[i] <= 'O')) sec += 7;
		else if (('P' <= dial[i]) && (dial[i] <= 'S')) sec += 8;
		else if (('T' <= dial[i]) && (dial[i] <= 'V')) sec += 9;
		else if (('W' <= dial[i]) && (dial[i] <= 'Z')) sec += 10;
	}
	printf("%d", sec);
	return 0;
}