//
//
//import java.io.FileOutputStream;
//import java.io.ObjectOutputStream;
//import java.io.Serializable;
//
//
//public class OutputStream {
//    public static void main(String[] args) {
//
//        Data data=new Data();
//        final String FILENAME = "myFile.txt";
//
//        try {
//            FileOutputStream fos = new FileOutputStream(FILENAME);
//            ObjectOutputStream bos = new ObjectOutputStream(fos);
//
//            bos.writeObject(data);
//            System.out.println("Object written to file");
//            bos.close();
//            fos.close();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//
//    }
//
//}
//
//class Data implements Serializable {
//    public String name="Ahmed";
//    public int age=2;
//
//
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    @Override
//    public String toString() {
//        return
//                "name='" + name  +
//                ", age=" + age
//                ;
//    }
//}
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class OutputStream {
    public static void main(String[] args) {
        Data data = new Data();
        final String FILENAME = "myFile.txt";

        try {
            FileOutputStream fos = new FileOutputStream(FILENAME);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            // Serialize the object
            oos.writeObject(data);
            System.out.println("Object written to file");

            oos.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
