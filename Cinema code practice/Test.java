public class Test {
    public static void main(String[] args) {
        Screen screen = new Screen("IMAX");
        System.out.println("Displaying all seats:");
        screen.displaySeats(); // Display all seats, including null ones

        System.out.println("\nDisplaying available seats:");
        screen.displayAvailableSeats(); // Display only available seats
    }
}
