import java.util.ArrayList;

public class Generics3 {

     <T extends Number>Generics3(T value){
         System.out.println(value);
    }
    public void wildCard(ArrayList<?> list){
         for(Object o : list){
             System.out.println(o);
         }
    }
    public <T>T getNumber(ArrayList <T> list) {
         return list.get(0);
    }
    }

