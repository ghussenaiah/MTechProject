/*
 * C program to find the factorial of a given number
 */
 
#include <stdio.h>
int main()
{
    int i, fact = 1, num;
 
    printf("Enter the number \n");
    scanf("%d", &num);
    if (num <= 0)
        fact = 1;
    else
    {
        for (i = 1; i <= num; i++)
        {
            fact = fact * i;
        }
    }

    printf("Factorial of %d = %5d\n", num, fact);
    return 0;
}
