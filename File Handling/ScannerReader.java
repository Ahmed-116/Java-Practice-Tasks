import java.io.File;
import java.util.Scanner;

public class ScannerReader {
    public static void main(String[] args) {
        try {
            File file = new File("Ahmed.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
