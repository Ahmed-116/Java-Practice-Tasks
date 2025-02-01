//abstract class Shape{
//    abstract void sides();
//
//
//}
//class Circle extends Shape{
//    void sides(){
//        System.out.println("No sides");
//    }
//}
//class Rectangle extends Shape{
//    void sides(){
//        System.out.println("4 sides");
//    }
//}
//
//
//
//
//public class Driver {
//    public static void main(String[] args) {
//
//        Shape circle = new Circle();
//        identifyShape(circle);
//        Shape rectangle = new Rectangle();
//        identifyShape(rectangle);
//
//
//
//    }
//    public static void identifyShape(Shape shape){
//             if(shape instanceof Circle){
//                 System.out.println("Circle");
//             }
//             else if(shape instanceof Rectangle){
//                 System.out.println("Rectangle");
//             }
//             else{
//                 System.out.println("Not a Shape");
//             }
//    }
//}
