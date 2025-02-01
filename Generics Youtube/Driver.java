import java.util.ArrayList;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        Generics1<Integer> generics1=new Generics1<>(2);
        System.out.println(generics1);
        Generics1<String> generics11=new Generics1<>("Ahmed");
        System.out.println(generics11);


        Generics2<Double> boundType= new Generics2<>(2.6,4.6);
        System.out.println(boundType);
        //String not possible because we bound to Number
        //Generics2<String> boundType1= new Generics2<>(2.6,4.6);
           Generics2<Number> boundType1= new Generics2<>(3.5,4);
           System.out.println(boundType1);

           Generics3 generics3=new Generics3(4.3);
           //Generics3 generics3=new Generics3("Sheikh");
        //generics3.wildCard(8);
       // generics3.getNumber(6);
        List<Integer> arrayList=new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        for (Integer integer : arrayList) {
            if(integer>4) {
                System.out.println(integer);
            }
        }

    }

}
