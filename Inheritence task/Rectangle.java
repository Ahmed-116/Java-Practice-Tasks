public class Rectangle extends Shape_2D {
     double width;
     double length;
    public Rectangle(String name,double width,double length) {
        super(name);
        this.width = width;
        this.length = length;
    }
 public double getArea(){
        return width*length;
 }
 public double getPerimeter(){
        return 2*width+2*length;
 }

}
