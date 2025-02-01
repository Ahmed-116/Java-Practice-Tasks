//import java.io.*;
//
//public class InputStream {
//    public static void main(String args[])  {
//        final String FILENAME = "myFile.txt";
//        try {
//            FileInputStream fileInputStream=new FileInputStream(FILENAME);
//            ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
//            Data data = (Data) objectInputStream.readObject();
//            System.out.println(data.toString());
//            objectInputStream.close();
//            fileInputStream.close();
//        }catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class InputStream {
    public static void main(String[] args) {
        final String FILENAME = "myFile.txt";
        try {
            FileInputStream fileInputStream = new FileInputStream(FILENAME);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            // Deserialize the object
            Data data = (Data) objectInputStream.readObject();
            System.out.println(data.toString()); // Print the object

            objectInputStream.close();
            fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
