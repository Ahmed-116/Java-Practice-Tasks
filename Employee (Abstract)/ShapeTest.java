

public class ShapeTest {
    //  Shape shapes[]=new Shape[10];

    public static void main(String[] args) {

//        Shape shape1; //= new Shape();
//
//        Shape shape2 ;
//
//        shape1 = new Circle();
//        shape1.displayShape();
//        ((Shape2D)shape1).area();

        Shape shapes[] = new Shape[10];
        shapes[0] = new Circle();
        shapes[1] = new Cube();

        shapes[2] = new Circle();
        shapes[3] = new Rectangle();

        ((Cube)shapes[1]).setSide1(3);



        for (Shape temp : shapes)
            if (temp != null)
                temp.displayShape();


        for (Shape temp : shapes)
            if (temp != null) {
                if (temp instanceof Shape2D)
                    System.out.println((((Shape2D) temp)).area());


                if (temp instanceof Shape3D)
                    System.out.println(((Cube) temp).volume());
            }


        //   increaseRadius(shapes,0.1);


    }

    public static void increaseRadius(Shape shapes[], double increaseValue) {
        for (Shape temp : shapes)
            if (temp != null) {
                double previousRadius = 0;
                double newRadius = 0;
                if (temp instanceof Circle) {
                    previousRadius = ((Circle) temp).getRadius();
                    newRadius = previousRadius * increaseValue + previousRadius;
                    ((Circle) temp).setRadius(newRadius);


                }
            }
    }
}


abstract class Shape3D extends Shape {


    public abstract double volume();
}


abstract class Shape2D extends Shape {


    public abstract double area();
}


abstract class Shape {
    private String name;
    private String color;

    public abstract void displayShape();
}


class Rectangle extends Shape2D {
    @Override
    public double area() {
        return Math.PI * 2 * Math.PI;
    }

    @Override
    public void displayShape() {
        System.out.println("This is a Rectangle");
    }
}


class Cube extends Shape3D {

    double side0;


    public double volume() {
        return Math.pow(getSide1(), 3);
    }

    public void displayShape() {
        System.out.println("This is a Cube");
    }

    public double getSide1() {
        return side0;
    }

    public void setSide1(double side0) {
        this.side0 = side0;
    }
}


class Circle extends Shape2D {

    public double radius = 2;

    @Override
    public void displayShape() {

        System.out.println("This is a Circle");

    }

    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}