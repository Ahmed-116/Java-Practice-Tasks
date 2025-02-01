/*
#include <stdio.h>


int main()
{
    int age,*ptr;
    age=25;
    ptr=&age;
    printf("%d\n",ptr);
    printf("%u\n",&ptr);
    printf("%d\n",*ptr);
    *ptr=*ptr+10;
    printf("%d\n",*ptr);
}
*/
/*#include <stdio.h>

void passing_args(int,int*);
void main()
{
    int a=10,b=20;
    printf("Before function call:\n");
    printf("a=%d,b=%d\n",a,b);
    passing_args(a,&b);
     printf("After function call:\n");
    printf("a=%d,b=%d\n",a,b);
}
void passing_args(int a,int *b)
{
    a=a+10;
    *b=*b+10;

}*/

/*
#include<stdio.h>
int main()
{
    int arr[4]={5,10,15,20};
    printf("%d,%d\n",&arr[0],&arr[3]);
    printf("%d,%d",arr+3,arr+4);
}*//*
#include<stdio.h>
int main()
{
int arr[2][2]={5,10,15,20};
printf("%d,%d\n",arr[0][0],&arr[1][1]);
printf("%d,%d",&arr[0],arr+4);

}*/
/*#include<stdio.h>
int main()
{
int arr[5]={5,10,15,20,25};
int i;
for(i=0;i<=4;i++){
    printf("%d,%d\n",*(arr+i),(arr+i));
}
}
*/
/*#include<stdio.h>
int main()
{
     int arr[4]={5,10,15,20};

    int i,*ptr;
    ptr=arr;
    for(i=0;i<=3;i++){
        printf("%d,%d\n",*ptr,ptr);
        ptr=ptr+1;
    }
}
*/

/*

#include<stdio.h>
int main()
{
    int n1,n2,n3;
    if(n1<0,n2<0,n3<0 )
    int digit1,digit2,digit3;
    printf("Enter number1\n");
    scanf("%d",&n1);
    printf("Enter number2\n");
    scanf("%d",&n2);
    printf("Enter number3\n");
    scanf("%d",&n3);
    digit1= n1/10;
    digit2= n2/10;
    digit3= n3/10;
    if(digit1==digit2||digit1==digit3||digit2==digit3)

        printf("Result is true\n");
        else
            printf("Result is false\n");

}
*/
/*
#include<stdio.h>
int main()
{
    double number;
    while(1)
    {
        printf("Enter a number to calculate square root(-1 to terminate):");
        scanf("%lf",&number);
        if(number==-1)
        {
            break;
        }
        if(number<0)
        {
            printf("Enter a positive number");
            continue;
        }
        double guess=number/2;
        for(int i=1;i<=10;i++)
        {
            guess=(guess+number/guess)/2;
        }
     printf("square root of %.2lf is %.6lf\n",number,guess);
    }
}
*/

/*
#include <stdio.h>

int main() {
    double number;

    while (1) {
        // Prompt the user to input a number
        printf("Enter a number to calculate its square root (-1 to terminate): ");
        scanf("%lf", &number);

        // Check if the user wants to terminate the program
        if (number == -1) {
            break;
        }

        // Ensure the number is positive
        if (number < 0) {
            printf("Please enter a positive number.\n");
            continue;
        }

        // Initial guess for the square root can be N/2
        double guess = number / 2.0;

        // Perform 10 iterations of the Babylonian method
        for (int i = 0; i < 10; i++) {
            guess = (guess + number / guess) / 2.0;
        }

        // Print the result
        printf("The square root of %.2lf is approximately %.6lf\n", number, guess);
    }

    return 0;
}*/
