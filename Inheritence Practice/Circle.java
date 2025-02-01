public class Circle {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
        System.out.println("Inside Circle Constructor");
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircleRadius() {
        return radius;
    }
}
