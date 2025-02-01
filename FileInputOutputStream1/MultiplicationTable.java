import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }

        String [] arr = new String[3];
        arr[0] = "a";
        arr[1] = "2";
        arr[2] = "3";

        for(String s : arr) {
            System.out.println(s);
        }
        int [][] table = new int[10][];
        table[0] = new int[10];
        table[1] = new int[10];
        table[2] = new int[8];
        table[3] = new int[10];

        table[2][7] =2;
        table[3][7] =3;

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 8; j++) {
                System.out.println(table[i][j]);
            }
        }
    }


}
