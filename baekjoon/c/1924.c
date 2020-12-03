#include <stdio.h>
int main() {
	int x=0, y=0, i=0, count=0;
	scanf("%d %d", &x, &y);
	
	int last[12] = { 31,28,31,30,31,30,31,31,30,31,30,31 };
	for (i = 1; i < x; i++) {
		count = count + last[i - 1];
	}
	count = count + y;

	switch (count % 7) {
	case 0: printf("SUN\n"); break;
	case 1: printf("MON\n"); break;
	case 2: printf("TUE\n"); break;
	case 3: printf("WED\n"); break;
	case 4: printf("THU\n"); break;
	case 5: printf("FRI\n"); break;
	case 6: printf("SAT\n"); break;
	}

	return 0;
}