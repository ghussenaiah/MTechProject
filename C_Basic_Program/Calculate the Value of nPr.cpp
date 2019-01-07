/*
 * C program to Calculate the Value of nPr
 */
#include <stdio.h>
 int f(int x);
 main()
{


   int n, r;
   printf("Enter value for n and r\n");
   scanf("%d%d", &n, &r);
   int npr = f(n) / f(n - r);
   printf("\n Permutation values is = %d", npr);
   
}
 
int f(int x)
{
   if (x <= 1)
       return 1;
   return x * f(x - 1);
}
