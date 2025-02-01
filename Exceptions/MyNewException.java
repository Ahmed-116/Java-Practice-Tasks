class NewException extends Exception {

    NewException(String message) {
        System.out.println(message);
    }
    }

public class MyNewException {



    public static void main(String[] args) throws NewException {
        int i=4;
        int j;
try {


    if (i == 4) {
        throw new NewException("4 nhi hu sakta");
    }
}
catch (Exception e) {
    System.out.println(e);
}
        System.out.println("Good hu gia");
}

    }
