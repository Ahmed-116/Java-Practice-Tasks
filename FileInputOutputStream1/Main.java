class CellPhone {
    public void call() {
        System.out.println("Calling CellPhone");
    }

    public void ring() {
        System.out.println("Calling Ring");
    }
}

public class Main {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        cellPhone.ring();
        cellPhone.call();
    }
}

