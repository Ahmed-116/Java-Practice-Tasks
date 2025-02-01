abstract class Pen {
    String color;


    abstract void draw();
}
class Ballpoint extends Pen{
String color;
    Ballpoint(){
         color="blue";

    }
    public void draw(){
       System.out.println(color);
    }
}
class InkPen extends Pen{
        InkPen(){
            color="red";
        }
        public void draw(){
           System.out.println(color);
        }
}
public class Driver {
    public static void main(String[] args) {
        Pen p1;
        p1=new Ballpoint();
        p1.draw();
        p1=new InkPen();
        p1.draw();

    }
}
