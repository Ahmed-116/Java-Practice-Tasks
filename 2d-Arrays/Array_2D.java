import java.util.Scanner;
public class Array_2D {
    int[][]ahmed=new int[3][4];
     Scanner sc=new Scanner(System.in);



    public void Formation() {
        for (int i = 0; i < ahmed.length; i++) {
            for (int j = 0; j < ahmed[i].length;j++) {
                ahmed[i][j] = sc.nextInt();
            }
        }
    }
    public void display() {
        for (int i = 0; i < ahmed.length; i++) {
            for (int j = 0; j < ahmed[i].length; j++) {
                System.out.print(ahmed[i][j] + " ");
            }
            System.out.println();
        }
    }

}
