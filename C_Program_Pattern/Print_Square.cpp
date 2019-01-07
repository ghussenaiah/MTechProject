/**
 * C program to print square star pattern
 */

#include <stdio.h>

int main()
{
    int i, j, N;

    printf("Enter number of rows: ");
    scanf("%d", &N);

    //Used to iterate over each row
    for(i=1; i<=N; i++)
    {
        //Used to print columns of each row
        for(j=1; j<=N; j++)
        {
            printf("*");
        }
        
        //Moves to the next line/row
        printf("\n");
    }

    return 0;
} 

