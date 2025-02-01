//FINAL EXAMINATION
//Muhammad Ahmed
//sp24bse066




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




    }
void addproducts()
{
    struct product p[5];
    FILE*fp;
    int i;

    fp=fopen("products.txt","w");
    if(fp==NULL) {
        printf("Error opening file\n");
        return;
    }

    for(i=0;i<5;i++)
    {
        printf("Enter Product_ID,Product_Name,Price\n");
        scanf("%d%s%d",&p[i].product_ID,p[i].product_Name,&p[i].price);
    }
    for(i=0;i<5;i++)
    {
        fprintf(fp,"%d\t%s\t%d\t",p[i].product_ID,p[i].product_Name,p[i].price);

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
        printf("%s\n", line);
    }
    fclose(fp);
}

void searchproducts()
{
    printf("x");
}




