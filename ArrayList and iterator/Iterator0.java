import java.util.ArrayList;
import java.util.Iterator;

public class Iterator0 {
    public static void main(String[] args) {


        ArrayList<Integer> a = new ArrayList();
        //ArrayList<Integer> a=new ArrayList<>();
        a.add(9);
        a.add(8);
        a.add(7);
        a.add(6);
        a.add(5);
        a.add(4);
        a.add(3);
        a.add(2);

        Iterator<Integer> it = a.iterator();
        // System.out.println(it.next());
        System.out.println(it.next());//error will come if we do more than its length

        while (it.hasNext()) {
            System.out.println(it.next());



//
//        }
//        System.out.println(a);
//
//    }
        }
    }
}
