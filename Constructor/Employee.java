public class Employee{

    private String name;
    private int age;
    Address address; //Address@4617c264

    Employee(String n,int a,Address ad){
        this.name = n;
        this.age = a;
        this.address = ad;

    }

     
    public void setAddress(Address a){
        this.address = a;
    }

    public Address getAddress(){
        return address;
    }

  /* public void setName(String n){
        this.name = n;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }
     */
    public void displayInfo(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
    }

}
