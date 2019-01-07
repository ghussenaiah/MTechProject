/*
 * C program to find out the roots of a quadratic equation
 * for non-zero coefficients. In case of errors the program
 * should report suitable error message.
 */
#include <stdio.h>
#include <stdlib.h>
#include <math.h>
 
int main()
{
    float a, b, c, root1, root2;
    float realp, imagp, disc;
 
    printf("Enter the values of a, b and c \n");
    scanf("%f %f %f", &a, &b, &c);
    /* If a = 0, it is not a quadratic equation */
    if (a == 0 || b == 0 || c == 0)
    {
        printf("Error: Roots cannot be determined \n");
        exit(1);
    }
    else
    {
        disc = b * b - 4.0 * a * c;
        if (disc < 0)
        {
            printf("Imaginary Roots\n");
            realp = -b / (2.0 * a) ;
            imagp = sqrt(abs(disc)) / (2.0 * a);
            printf("Root1 = %f  +i %f\n", realp, imagp);
            printf("Root2 = %f  -i %f\n", realp, imagp);
        }
        else if (disc == 0)
        {
            printf("Roots are real and equal\n");
            root1 = -b / (2.0 * a);
            root2 = root1;
            printf("Root1 = %f\n", root1);
            printf("Root2 = %f\n", root2);
        }
        else if (disc > 0 )
        {
            printf("Roots are real and distinct \n");
            root1 =(-b + sqrt(disc)) / (2.0 * a);
            root2 =(-b - sqrt(disc)) / (2.0 * a);
            printf("Root1 = %f  \n", root1);
            printf("Root2 = %f  \n", root2);
        }
    }
    return 0;
}
