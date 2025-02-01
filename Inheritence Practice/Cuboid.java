

public class Cuboid extends Rectangle {
    private double height;
    Cuboid(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public double getVolume() {
        return getArea() * height;
    }

}
