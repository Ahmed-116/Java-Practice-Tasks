//
//
//import java.util.Comparator;
//import java.util.Objects;
//
//public class Product implements Comparable, Comparator{
//    double price;
//    int rating;
//    int manafuctureYear;
//    String productName;
//    int id;
//
//    public Product(double price, int rating, int manafuctureYear, String productName,int id) {
//        this.price = price;
//        this.rating = rating;
//        this.manafuctureYear = manafuctureYear;
//        this.productName = productName;
//        this.id = id;
//    }
//
//
//    @Override
//    public int compareTo(Object o) {
//        int compare=0;
//        Product p=(Product)o;
//        if(p.id==this.id)
//            compare=0;
//        else if(p.id<this.id)
//            compare=1;
//        else if (p.id>this.id)
//            compare=-1;
//        return compare;
//    }
//
//    @Override
//    public int compare(Object o1, Object o2) {
//        Product p1 = (Product) o1;
//        Product p2 = (Product) o2;
//
//       if(p1.id < p2.id) {
//            return -1;
//
//
//        }
//        else {
//            return 0;
//        }
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Product product = (Product) o;
//        return Double.compare(price, product.price) == 0 && rating == product.rating && manafuctureYear == product.manafuctureYear && id == product.id && Objects.equals(productName, product.productName);
//    }
//
//
//
//    @Override
//    public String toString() {
//        return
//                "price=" + price +
//                ", rating=" + rating +
//                ", manafuctureYear=" + manafuctureYear +
//                ", productName='" + productName + '\'' +
//                ", id=" + id +"\n"
//                ;
//    }
//}


import java.util.Comparator;
import java.util.Objects;

public class Product implements Comparable<Product>, Comparator{
    double price;
    int rating;
    int manafuctureYear;
    String productName;
    int id;

    public Product(double price, int rating, int manafuctureYear, String productName,int id) {
        this.price = price;
        this.rating = rating;
        this.manafuctureYear = manafuctureYear;
        this.productName = productName;
        this.id = id;
    }


    @Override
    public int compareTo(Product p) {
        int compare=0;
//        if(p.id==this.id)
//            compare=0;
//        else if(p.id<this.id)
//            compare=1;
//        else compare=-1;
//        return compare;
        return Integer.compare(this.manafuctureYear, p.manafuctureYear);
    }

    @Override
    public int compare(Object o1, Object o2) {
        Product p1 = (Product) o1;
        Product p2 = (Product) o2;

        if(p1.id < p2.id) {
            return -1;


        }
        else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(price, product.price) == 0 && rating == product.rating && manafuctureYear == product.manafuctureYear && id == product.id && Objects.equals(productName, product.productName);
    }



    @Override
    public String toString() {
        return
                "price=" + price +
                        ", rating=" + rating +
                        ", manafuctureYear=" + manafuctureYear +
                        ", productName='" + productName + '\'' +
                        ", id=" + id +"\n"
                ;
    }
}
