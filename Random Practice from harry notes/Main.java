import java.util.Scanner;

class Cylinder {
    private double cylinderRadius;
    private double cylinderHeight;
    public Cylinder(double cylinderRadius, double cylinderHeight) {
        this.cylinderRadius = cylinderRadius;
        this.cylinderHeight = cylinderHeight;
    }
    public Cylinder() {
        this(5, 4);
    }
    public double getCylinderRadius() {
        return cylinderRadius;
    }
    public double getCylinderHeight() {
        return cylinderHeight;
    }
    public void setCylinderRadius(double cylinderRadius) {
        this.cylinderRadius = cylinderRadius;
    }
    public void setCylinderHeight(double cylinderHeight) {
        this.cylinderHeight = cylinderHeight;

    }
    public double getVolume() {
        return cylinderRadius * cylinderHeight;
    }




}
class Stupid{
    public String name;
    public String lastName;
    Scanner sc = new Scanner(System.in);
    public void main() {
        name = sc.nextLine();
        lastName = sc.nextLine();
        System.out.println("Your name is: "+name+" "+lastName);
        System.out.println(name.indexOf("m"));
        System.out.println(name.toUpperCase());
        String a=name.replaceAll("Ahmed","Don");
        System.out.println("My name is: "+a);
    }
}
class Integer{
    int num;
    Scanner sc = new Scanner(System.in);
    public void main1() {
        num = sc.nextInt();

    }
}
public class Main{
    public static void main(String[] args) {
        Stupid st=new Stupid();

        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder.getCylinderRadius());
        System.out.println(cylinder.getCylinderHeight());
        System.out.println(cylinder.getVolume());
        st.main();

    }
}
