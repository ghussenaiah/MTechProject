/*
 * C program to simulate a simple calculator to perform arithmetic
 * operations like addition, subtraction, multiplication and division
 */
#include <stdio.h>
 
int main()
{
    char ch;
    float num1, num2, result;
 
    printf("Simulation of a Simple Calculator\n");
    printf("*********************************\n");
    printf("Enter two numbers \n");
    scanf("%f %f", &num1, &num2);
    fflush(stdin);
    printf("Enter the operator [+,-,*,/] \n");
    scanf("%c", &ch);
    switch(ch)
    {
    case '+': result = num1 + num2;
        break;
    case '-': result = num1 - num2;
        break;
    case '*': result = num1 * num2;
        break;
    case '/': result = num1 / num2;
        break;
    default : printf("Error in operationn");
        break;
    }
    printf("\n %5.2f %c %5.2f = %5.2f\n", num1, ch, num2, result);
    return 0;
}
