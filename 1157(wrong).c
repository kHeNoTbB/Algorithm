#include <stdio.h>
#include <string.h>
#define MAX 1000000
int main() {
	char arr[MAX];
	char alphabet[26] = { 0, };
	scanf("%s", &arr);
	int len = strlen(arr);
	int i = 0, j=0, n = 0, N=0;
	int max = 0; int a = 0; int mem = 0;

	for (i = 0; i < len; i++) {
		if (arr[i] >= 97 && arr[i] <= 122) {
			for (n = 97; n < 123; n++) {
				if (arr[i] == n) alphabet[n - 97]++;
			}
		}
		if (arr[i] >= 65 && arr[i] <= 90) {
			for (N = 65; N < 91; N++) {
				if (arr[i] == N) alphabet[N - 65]++;
			}
		}
	}

	for (i = 0; i < 26; i++)
		if (max < alphabet[i]) {
			max = alphabet[i];
			mem = i;
		}

	for (i = 0; i < 26; i++)
		if (max == alphabet[i]) a++;
	
	if (a > 1) printf("?");
	else printf("%c", mem+65);

	return 0;
}