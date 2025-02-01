import java.util.Scanner;

public class Screen {
    private String screenType;
    private String screenID;
    public static int counter = 0;
    Scanner sc = new Scanner(System.in);
    Seat[][] seats;

    {
        seats = new Seat[8][];
        for (int i = 0; i < 8; i++) {
            seats[i] = new Seat[5 + i]; // Initialize each row with variable column size
        }

        while (true) {
            System.out.println("Enter row number (1-8) or 0 to exit:");
            int row = sc.nextInt();
            if (row == 0) {
                break; // Exit the loop
            }
            if (row < 1 || row > 8) {
                System.out.println("Invalid row number. Try again.");
                continue; // Restart the loop for valid input
            }

            System.out.println("Enter column number (1-" + (5 + (row - 1)) + ") or 0 to exit:");
            int col = sc.nextInt();
            if (col == 0) {
                break; // Exit the loop
            }
            if (col < 1 || col > (5 + (row - 1))) {
                System.out.println("Invalid column number. Try again.");
                continue; // Restart the loop for valid input
            }

            row--; // Convert to zero-based index
            col--; // Convert to zero-based index

            System.out.println("Enter seat price:");
            int price = sc.nextInt();
            sc.nextLine(); // Consume newline character
            System.out.println("Enter seat type:");
            String seatType = sc.nextLine();
            System.out.println("Is seat available? (true/false):");
            boolean isAvailable = sc.nextBoolean();

            // Initialize the seat
            seats[row][col] = new Seat("Seat " + (row + 1) + (col + 1), price, seatType, isAvailable);
            System.out.println("Seat initialized successfully!");
        }

        System.out.println("Exiting seat initialization. Remaining seats are set to null.");
    }

    public Screen(String screenType) {
        this.screenType = screenType;
        this.screenID = String.format("%03d", counter++);
    }

    public void setScreenType(String screenType) {
        this.screenType = screenType;
    }

    public String getScreenType() {
        return screenType;
    }

    public String getScreenID() {
        return screenID;
    }

    public void displaySeats() {
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                if (seats[i][j] != null) {
                    System.out.print(seats[i][j] + " | ");
                } else {
                    System.out.print("null | ");
                }
            }
            System.out.println(); // Move to the next row
        }
    }

    public void displayAvailableSeats() {
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                if (seats[i][j] != null && seats[i][j].isAvailable()) {
                    System.out.println(seats[i][j]);
                }
            }
        }
    }
}
