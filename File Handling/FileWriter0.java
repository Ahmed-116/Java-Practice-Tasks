import java.io.FileWriter;
public class FileWriter0 {


    public static void main(String[] args) {
//        try {
//            FileWriter fileWriter=new FileWriter("Ahmed.txt");
//            fileWriter.write("Ahmed");
//            fileWriter.write("\n");
//            fileWriter.write("Age:19");
//            fileWriter.close();
//            System.out.println("Successfully wrote to the file");
//
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
        try{
            FileWriter fileWriter2=new FileWriter("C:\\File handling files\\Created3.txt");
            fileWriter2.write("AhmedCreateIt Successfully\n");
            fileWriter2.write("Yesssss...");
            fileWriter2.write("L mera");
            fileWriter2.close();
            System.out.println("Successfully wrote to the file");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
