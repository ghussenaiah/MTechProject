/* Source code to demonstrate, handling of pointers in C program */


/* 


Suppose, the programmer want pointer pc to point to the address of c. Then,

int c, *pc;
pc=c;  /* pc is address whereas, c is not an address. */
*pc=&c; /* &c is address whereas, *pc is not an address. */
In both cases, pointer pc is not pointing to the address of c.

*/
#include <stdio.h>
int main(){
   int* pc;
   int c;
   c=22;
   printf("Address of c:%d\n",&c);
   printf("Value of c:%d\n\n",c);
   pc=&c;
   printf("Address of pointer pc:%d\n",pc);
   printf("Content of pointer pc:%d\n\n",*pc);
   c=11;
   printf("Address of pointer pc:%d\n",pc);
   printf("Content of pointer pc:%d\n\n",*pc);
   *pc=2;
   printf("Address of c:%d\n",&c);
   printf("Value of c:%d\n\n",c);
   return 0;
}

