 class Cylinder0 {
    double radius;
    double height;
//  Cylinder0(double radius, double height) {
//      this.radius = radius;
//      this.height = height;
//  }

     public double getRadius() {
         return radius;
     }

     public void setRadius(double radius) {
         this.radius = radius;
     }

     public double getHeight() {
         return height;
     }

     public void setHeight(double height) {
         this.height = height;
     }
     public double calVolume() {
      return Math.PI * radius * radius * height;
     }
     public double calSurfaceArea() {
      return 2 * Math.PI * radius * height;
     }

 }
public class Cylinder {
    public static void main(String[] args) {
        Cylinder0 cylinder0 = new Cylinder0();
        cylinder0.setRadius(5);
        cylinder0.setHeight(10);
        System.out.println(cylinder0.getRadius());
        System.out.println(cylinder0.getHeight());
        System.out.println(cylinder0.calVolume());
        System.out.println(cylinder0.calSurfaceArea());

    }

}

