//Compound Interest
#include<stdio.h>
#include<math.h>
int main()
{
	float p, r, t, c;
	printf("Enter Principle: ");
    scanf("%f", &p);
    printf("Enter Rate: ");
    scanf("%f", &r);
    printf("Enter Time: ");
	scanf("%f", &t);
	c = p*(pow((1+r/100),t));
	printf("compound interest = %f",c);
	return 0;
}
