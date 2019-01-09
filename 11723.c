#include <stdio.h>
int main() {
	int n, x;
	unsigned int k = 0;
	char arr[10];
	scanf("%d", &n);
	while (n--) {
		scanf("%s", arr);

		switch (arr[1]) {
		case 'd' :
			scanf("%d", &x);
			k |= (1 << x);
			break;
		case 'e':
			scanf("%d", &x);
			k &= ~(1 << x);
			break;
		case 'h':
			scanf("%d", &x);
			printf("%d\n", k&(1 << x) ? 1 : 0);
			break;
		case 'o':
			scanf("%d", &x);
			k ^= (1 << x);
			break;
		case 'l':
			k = (1 << 21) - 1;
			break;
		case 'm':
			k = 0;
			break;
		}
	}
	return 0;
}