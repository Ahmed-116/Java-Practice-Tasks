import java.util.ArrayList;

public class ArrayList0 {
    public static void main(String[] args) {


//        ArrayList list = new ArrayList();
//        list.add(3);//0 index
//        list.add("Ahmed");
//        list.add(4);
//        list.add(5);//3rd index
//        list.add(6);
//        list.add(3,"Hi");
//        System.out.println(list);
//        System.out.println(list.get(3));


//        ArrayList list0 = new ArrayList();
//        list0.add(1.1);
//        list0.add(2.2);
//        list0.add(3.3);
//        list0.add(4.4);
//        Object[] array= list0.toArray();//to convert list into array
//        for(Object o: array){
//            System.out.println(o);
//        }


    ArrayList list3=new ArrayList();
    ArrayList list4=new ArrayList();
    list3.add(10);
    list3.add(20);
    list3.add(30);
    list3.add(40);
    list3.add(50);
    list3.add("L mera");
    list4.add(1);
    list4.add(200);
    list4.add(10);
       System.out.println(list3);
        list3.remove(0);
        System.out.println(list3);
        list3.remove(Integer.valueOf(20));
        System.out.println(list3);
       // list3.clear();
      //  System.out.println(list3);
       list3.addFirst(list4);
       System.out.println(list3);
        Object[] arr= list3.toArray();
        for (Object o : arr) {
            System.out.println(o);
        }
        System.out.println(list3.addAll(list4));
      System.out.println(list3);

//        list3.addAll(2, list4);
//        System.out.println(list3);

//        System.out.println(list3.contains(list4));
//        System.out.println(list3);
//       int l=list3.lastIndexOf(30);
        System.out.println(list3.lastIndexOf("L mera"));
        System.out.println(
                list3.indexOf(50)
        );
//        System.out.println(l);


    }
}
