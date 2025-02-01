import java.io.File;

public class FileCreation {
    public static void main(String[] args) {
        //File creation
//        try {
//            File file=new File("Ahmed.txt");
//            if(file.createNewFile()){
//                System.out.println("File created"+file.getName());
//            }
//            else{
//                System.out.println("File already exists");
//            }
//
//
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
        try{
            File file1=new File("C:\\File handling files\\Created3.txt");
            if(file1.createNewFile()){
                System.out.println("File Created "+file1.getName());

            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
