class Rectangle {
    int area;

    Rectangle(int area) {
        this.area = 20;
        System.out.println(area);
        // Refers to the current object's "area" field
    }

    void printArea() {
        System.out.println("The area is: " + area);
    }
}
public class Main1{
    public static void main(String[] args) {

Rectangle r1 = new Rectangle(3);

        r1.printArea();
    }
}