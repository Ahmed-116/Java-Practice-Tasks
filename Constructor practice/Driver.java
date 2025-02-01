public class Driver{

       public static void main(String[] args){

           Student st1=new Student("Ahmed",19,new Address("Lahore","Garden Town"));
           st1.display1();
            st1.getAddress().display();
       }

    
}