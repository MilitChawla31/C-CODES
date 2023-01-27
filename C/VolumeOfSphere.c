#include<stdio.h>
int main()
{
    int r;
    float volume;
    printf("Enter r: ");
    scanf("%d" ,&r);
    volume = 1.3*3.14*r*r*r;
    printf("Volume is = %f", volume);
    return 0;
}
