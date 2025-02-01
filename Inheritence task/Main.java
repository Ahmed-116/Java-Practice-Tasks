public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[10];
        shapes[0]=new Shape_2D("2D-Shape");
        shapes[1]=new Shape_3D("3D-Shape");
        shapes[2]=new Circle("Circle",3.4);
        shapes[3]=new Rectangle("Rectangle",3.4,4.5);
        shapes[4]=new Sphere("Sphere",5.5);

        System.out.println(shapes[2].getArea());
        System.out.println(shapes[3].getPerimeter());
        System.out.println(shapes[4].getVolume());

    }
}
