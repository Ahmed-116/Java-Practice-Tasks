

interface A {
    default void display() {
        System.out.println("Display from A");
    }
}

interface B {
    default void display() {
        System.out.println("Display from B");
    }
}

class C implements A, B {
    @Override
    public void display() {
        A.super.display();
    }

    // Resolve the conflict between A and B here
}

public class Main {
    public static void main(String[] args) {
        C obj = new C();
        obj.display();
    }
}
