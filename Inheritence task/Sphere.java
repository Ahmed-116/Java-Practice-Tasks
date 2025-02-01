public class Sphere extends Shape_3D{
   double radius;
    public Sphere(String name, double radius) {
        super(name);
        this.radius = radius;
    }
   public double getVolume() {
        return 4/3 * Math.PI * radius * radius*radius;
   }

}
