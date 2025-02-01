interface Printer {
    void print();
    default void info() {
        System.out.println("Default Printer Info");
    }
}

class LaserPrinter implements Printer {
    public void print() {
        System.out.println("Laser Printer Printing");
    }
    public void info() {
        //Printer.super.info();
        System.out.println("Laser Printer Info");
    }
}

public class TestPrinter {
    public static void main(String[] args) {
        Printer p = new LaserPrinter();
        p.print();
        p.info();
    }
}
