#include <stdio.h>
int main() {
	int people[9] = { 0, };
	int sum = 0;
	int a = 0, b = 0;
	int temp = 0;

	for (int i = 0; i < 9; i++)	scanf("%d", &people[i]);
	for (int i = 0; i < 9; i++) sum += people[i];

	for (int i = 0; i < 8; i++) {
		for (int j = i + 1; j < 9; j++) {
			if (100 == (sum - (people[i] + people[j]))) {
				a = i; b = j; break;
			}
		}
	}
	people[a] = 0; people[b] = 0;

	for (int i = 0; i < 9; i++)
	{
		for (int j = 0; j < 8; j++)
		{
			if (people[j] > people[j + 1])
			{
				temp = people[j];
				people[j] = people[j + 1];
				people[j + 1] = temp;
			}
		}
	}


	for (int i = 0; i < 9; i++) {
		if (people[i] != 0) printf("%d\n", people[i]);
	}


	return 0;
}