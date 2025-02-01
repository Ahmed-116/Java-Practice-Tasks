public class ThrowException {
    public static void main(String[] args) {
        int i=0;
        int j;

        try {
            j=5/i;
            if(j==0)
                throw new ArithmeticException("Fuck hu gia");
        }
        catch(ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("Baqi sab sahi ha");
    }
}
