public class Demo{

    public static void main(String[] args){


        Employee e1 = new Employee("Hareem",21,new Address("Lahore",24));
        e1.displayInfo();
        e1.getAddress().displayInfo();


        // e1.getAddress().setCity("Lahore");
        // e1.getAddress().setStNo(24);

        // e1.getAddress().displayInfo();
}
}