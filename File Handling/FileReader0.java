import java.io.FileReader;

public class FileReader0 {
    // Java program to show the usage of
// IO FileReader Class


    // Driver Class

        // main function
        public static void main(String[] args)
        {
            try {
                // FileReader Class used
                FileReader fileReader
                        = new FileReader("C:\\Users\\lenovo\\OneDrive\\Desktop\\New Text Document.txt");

//               System.out.println("Reading char by char : \n");
//                int i;
//
//                // Using read method
//                while ((i = fileReader.read()) != -1) {
//                    System.out.print((char)i);
//                }


                System.out.println("Reading using array : \n");
                char[] charArray = new char[16930];

                // Using read method for to get character array
                fileReader.read(charArray);
                System.out.print(charArray);

                // Close method called
                fileReader.close();
                System.out.println("FileReader closed!");
            }
            catch (Exception e) {
                System.out.println(e);
            }
        }
    }


