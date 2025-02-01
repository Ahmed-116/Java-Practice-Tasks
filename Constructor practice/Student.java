public class Student{
        private String name;
        private int age;
        private Address address;

        Student(String n,int a,Address ad){
               this.name=n;
               this.age=a;
               this.address=ad;
        }
        public void setAddress(Address add){
                 this.address=add;

        }
        public Address getAddress(){
              return address;
        }
        public void display1(){

            System.out.println(name);
            System.out.println(age);
            System.out.println(address);
           
             }
}