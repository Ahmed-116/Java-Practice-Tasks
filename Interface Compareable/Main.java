

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Product products[]=new Product[5];

        products[0]=new Product(100,4,9020,"product1",15);
        products[1]=new Product(99,4,2019,"product2",8);

        products[2]=new Product(200,4,1020,"product3",9);

        products[3]=new Product(150,4,020,"product4",1);
        products[4]=new Product(10,4,8020,"product5",2);
//              Arrays.sort(products,products[2]);
//        System.out.println(Arrays.toString(products));
         Collections.sort(Arrays.asList(products));
              System.out.println(Arrays.toString(products));
//              Arrays.sort(products,1,4);
   //    System.out.println(Arrays.toString(products));
//          Collections.sort(products, products[0]);

//       System.out.println(Arrays.binarySearch(products,new Product(150,4,2020,"product4",1)));
//        System.out.println(products.equals(products));

//        Arrays.fill(products,5,9,new Product(100,4,2020,"product1",15));
//        System.out.println(Arrays.toString(products));
    }
}