public class SmartPhone extends Phone implements Gps,Camera{


    @Override
    public void location() {
        System.out.println("SmartPhone location");
    }
    public void fold(){
        System.out.println("SmartPhone fold");
    }

    @Override
    public void moveCamera() {
        System.out.println("SmartPhone moveCamera");
    }

    @Override
    public void click() {
        System.out.println("SmartPhone click");
    }

    @Override
    public void maps() {
        System.out.println("SmartPhone maps");
    }
}
