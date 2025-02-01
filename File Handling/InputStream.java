import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class InputStream {


    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\lenovo\\OneDrive\\Documents\\Civics\\1. Civics and community engagement.pdf");
               int data;

            while((data= fis.read()) != -1) {

                System.out.print((char)data);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
