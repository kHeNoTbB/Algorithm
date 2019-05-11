#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <algorithm>
int main() {
	int n, temp = 0, sum = 0;
	int people[1005];
	
	scanf("%d", &n);
	for (int i = 0; i < n; i++) scanf("%d", &people[i]);

	std::sort(people, people + n);
	for (int i = 0; i < n; i++)	sum = sum + (n - i)*people[i];
	
	printf("%d", sum);
	

	return 0;
}