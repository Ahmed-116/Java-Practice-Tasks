import java.io.File;

public class FileDelete {
    public static void main(String[] args) {
        try {
            File file3 = new File("C:\\Users\\lenovo\\OneDrive\\Desktop\\New folder"); //Any file can delete from computer
            if (file3.delete()) {
                System.out.println("File deleted successfully " + file3.getName());
            }
            else {
                System.out.println("File could not be deleted" + file3.getName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
