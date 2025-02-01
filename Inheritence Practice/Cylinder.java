public class Cylinder extends Circle{
    public double height;
   public double radius=200;

    public Cylinder(){
        super(10);

       // this.height = height;

    }
  public void getCylinerArea(){
        double cylinerArea = 3.5*height*height;
        System.out.println(cylinerArea);
  }
  public double volume(){
        return height*height;

  }
  public double getRadius(){
        return radius;
  }

}
