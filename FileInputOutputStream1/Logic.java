import java.util.Scanner;

public class Logic {
    public static void main(String[] args) {
        Logic logic = new Logic();
        float[] numbers = new float[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextFloat();
        }
        float average = logic.average(numbers);
        System.out.println(average);




    }

    public float average(float...n) {
        float sum = 0;
        for (int i = 0; i < n.length; i++) {
            sum += n[i];
        }
        return sum / n.length;
    }
}
//public class Logic {
//    public static void main(String[] args) {
//        double[] numbers = {10, 10, 10,10, 10}; // Example set of numbers
//        double avg = calculateAverage(numbers);
//        System.out.println("The average is: " + avg);
//    }
//
//    public static double calculateAverage(double[] numbers) {
//        double sum = 0;
//        for (double num : numbers) {
//            sum += num; // Sum all numbers
//        }
//        return sum / numbers.length; // Divide sum by the count of numbers
//    }
//}
