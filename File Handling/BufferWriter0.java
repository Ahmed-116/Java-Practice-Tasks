import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class BufferWriter0 {
    public static void main(String[] args)  {
        try {


            FileWriter fileWriter = new FileWriter("Ahmed.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Ahmed new2\n");
            bufferedWriter.write("Ahmed new3\n");
            bufferedWriter.write("Ahmed new4\n");
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
