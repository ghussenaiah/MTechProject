/*
 * C program to create a file called emp.rec and store information
 * about a person, in terms of his name, age and salary.
 */
#include <stdio.h>
 
int main()
{
    FILE *fptr;
    char name[20];
    int age;
    float salary;
    //file will create at exe location
 
    /*  open for writing */
    fptr = fopen("test.txt", "w");4
 
    if (fptr == NULL)
    {
        printf("File does not exists \n");
      
    }
    printf("Enter the name \n");
    scanf("%s", name);
    fprintf(fptr, "Name    = %s\n", name);
    printf("Enter the age\n");
    scanf("%d", &age);
    fprintf(fptr, "Age     = %d\n", age);
    printf("Enter the salary\n");
    scanf("%f", &salary);
    fprintf(fptr, "Salary  = %.2f\n", salary);
    fclose(fptr);
    return 0;
}
