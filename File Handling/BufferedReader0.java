
import java.io.FileReader;
import java.io.BufferedReader;

public class BufferedReader0 {
    public static void main(String[] args) {
        try{
            FileReader fileReader=new FileReader("C:\\Users\\lenovo\\OneDrive\\Desktop\\New Text Document.txt");
            BufferedReader br = new BufferedReader(fileReader);
            String line;
            System.out.println("Reading Line by Line");
            while((line=br.readLine())!=null){
                System.out.println(line);
            }
            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
