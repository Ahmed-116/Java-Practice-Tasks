import org.w3c.dom.ls.LSOutput;

class Ahmed {
    Ahmed() {
        System.out.println("Ahmed here");
    }
}
class Hamza{
        {
            System.out.println("non static Hamza here");
        }
   static {
        System.out.println("static Hamza here");
    }
    }

class Mohal{
    public static String age;
    Mohal() {
        System.out.println("Mohal here");
    }
     {
        age = "feMale";
         System.out.println("Mohal is female");


    }
       static{
        age = "male";
           System.out.println("Mohal is male");
    }
    public static void getAge(){
        System.out.println("static " + age);
    }


}
public class Employee {
    public static void main(String[] args) {
        Ahmed ahmed = new Ahmed();
        Hamza hamza = new Hamza();
        Mohal mohal = new Mohal();
        mohal.getAge();
    }
}


