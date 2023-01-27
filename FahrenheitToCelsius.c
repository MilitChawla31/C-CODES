//Fahrenheit to Celsius
#include<stdio.h>
int main()
{
	float f, c;
	printf("Enter Temp in FAHRENHEIT: ");
	scanf("%f",&f);
	c = (f-32)*5/9;
	printf("Temp in CELSIUS: %f", c);
	return 0;
}
