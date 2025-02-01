//FINAL EXAMINATION
//Muhammad Ahmed
//sp24bse066


#include <stdio.h>

void SumEven(int arr[],int n);
int main() {
    int n;

    printf("Enter the size of the array: ");
    scanf("%d",&n);

    int arr[n];
    for (int i=0;i<n;i++)
    {
        printf("Enter value %d:\n",i+1);
        scanf("%d",&arr[i]);
    }

    SumEven(arr,n);

    return 0;
}
void SumEven(int arr[],int n)
{
    int sumEven=0;
    int countOdd=0;

    for (int i=0;i<n;i++)
        {
        if(arr[i]%2==0)
        {
        sumEven=sumEven+arr[i];
        }
    else
        {
            countOdd++;
        }
    }
    printf("Sum of even numbers: %d\n", sumEven);
    printf("Total number of odd numbers: %d\n", countOdd);
}

