//FINAL EXAMINATION
//Muhammad Ahmed
//sp24bse066
#include<stdio.h>
int main()
{
    char chose;
    printf("Enter X if you want to execute part A and Y if you want to execute part B:");
    scanf("%c",&chose);
    if(chose=='x')
{


#include <stdio.h>
#include<string.h>
void addproducts();
void displayproducts();
void searchproducts();
void lowestprice();

struct product
{
    int product_ID;
    char product_Name[10];
    int price;
};


int main()
{

   int number;
   char choice;

        do
        {


        printf("Enter 1 if you want to add products:\n");
        printf("Enter 2 if you want to display products:\n");
        printf("Enter 3 if you want to search products:\n");
        printf("Enter 4 if you want to find product with lowest price:\n");
        scanf("%d",&number);

        if(number==1)
        addproducts();
        else if(number==2)
        displayproducts();
        else if(number==3)
        searchproducts();
        else if(number==4)
        return;

         printf("Enter Z if you want to continue:");
        choice=getche();
    }while(choice=='Z');


    }
void addproducts()
{
    FILE*fp;
    int i;
    struct product p[5];
    fp=fopen("Products.txt","w");
    if(fp==NULL) {
        printf("Error opening file.\n");
        return;
    }

    for(i=0;i<=5;i++)
    {
        printf("Enter Product_ID,Product Name,Price\n");
        scanf("%d %s %d\n",&p[i].product_ID,p[i].product_Name,&p[i].price);
    }
    for(i=0;i<=5;i++)
    {
        fprintf(fp,"%d %s %d\n",p[i].product_ID,p[i].product_Name,p[i].price);

    }

   fclose(fp);


}
void displayproducts()
{
   FILE *fp;
   fp=fopen("Products.txt","r");
    if(fp==NULL)
        {
        printf("No product data found. Please enter product data first.\n");
        return;
    }
    char line[100];
    while (fgets(line,sizeof(line),fp)) {
        printf("%s", line);
    }
    fclose(fp);
}

void searchproducts()
{
    printf("x");
}

}
else if(chose=='y')
{


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
}
else
{
    printf("Invalid selection");
}


