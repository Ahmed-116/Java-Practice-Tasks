
class A {
    static int a = 200;
    int x = 999;
    int i = 0;

    A() {
        super();
        System.out.println("A constructor called " + i);
    }

    A(int i) {
        super();
        System.out.println("Paramertized A constructor called " + this.i); //output:0 and if this. remove then 8
        this.i = i;
        //System.out.println("Paramertized A constructor called " + this.i); //output:8
    }
}
  public class B extends A{
      String x="hello";

      static int a=400;

      int i = 20;
      B(){
          super(8);
         // System.out.println("B's constructor I"+super.i);
          System.out.println("B's constructor I"+i);
          System.out.println("value in a "+a);
      }


  }
  class C {
      public static void main(String[] args) {
          B b=new B();
      }
  }


