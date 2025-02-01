public class Driver {
    public static void main(String[] args) {
//        SmartPhone smartPhone = new SmartPhone();
//        smartPhone.click();
//        smartPhone.call();
//        smartPhone.location();
//        smartPhone.moveCamera();
//
//
//        Phone phone = new Phone();
//
//        phone.call();
//
//
//
//
//        Gps gps = new SmartPhone();
//        gps.location();
//        gps.maps();
//        ((Phone) gps).call();
//        System.out.println(gps.a);
        //new knowledge unlocked


        Camera camera=new SmartPhone();
        camera.moveCamera();
        camera.click();



     Phone phone = new SmartPhone();

        ((Gps)phone).location();

        Gps gps2 = new SmartPhone();

        ((Phone)gps2).call();

        SmartPhone smartPhone = new SmartPhone();
        smartPhone.city();

        Gps.country();

        smartPhone.city();


      }


    }
