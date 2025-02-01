import java.util.Scanner;

public class VarArgs {
    public static void main(String[] args) {
        VarArgs v = new VarArgs();
        v.add(2, 3, 3, 2);
        v.add(3, 3, 3, 3);
        v.add1(new int[]{1});
    }

    public void add(int... a) {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println(sum);
    }

    public void add1(int[] a) {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println(sum);
        System.out.println(a.length);
    }
}
