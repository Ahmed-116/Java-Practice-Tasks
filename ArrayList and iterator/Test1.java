 class A {
    public void method1() {
        System.out.println("a 1");
    }
    public void method2() {
        System.out.println("a 2");
    }
}
//----------------------Class B
 class B extends A {
    public void method1() {
        System.out.println("b 1");
    }
}
//----------------------Class C
 class C extends B {
    public void method2() {
        System.out.println("c 2");
    }
}

 public class Test1 {
     public static void main(String[] args) {
         A[] elements = {
                 new A(),
                 new B(),
                 new C()
         
         };
         for (int i = 0; i < elements.length; i++) {
             elements[i].method1();
             elements[i].method2();   //watch here if we call new C() it will print b1 not a1 i think bcz it extends B
         }
     }
 }

 //watch here if we call new C() it will print b1 not a1 i think bcz it extends B