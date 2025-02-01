 class ParentInheritence {
    public void play(){
        System.out.println("This is the parent inheritence");
    }
}
class child extends ParentInheritence {
    public void play(){
        System.out.println("play");
    }
}
public class Main9 {
    public static void main(String[] args) {


        ParentInheritence pi = new ParentInheritence();
        pi.play();
    }
}