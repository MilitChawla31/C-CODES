//program to swap two nos
#include<stdio.h>
int main()
{
	int a, b;
	printf("Enter a: ");
	scanf("%d", &a);
	printf("enter b: ");
	scanf("%d", &b);
	a = a+b;
	b = a-b;
	a = a-b;
	printf("after swapping: %d %d", a, b);
	return 0;
}
