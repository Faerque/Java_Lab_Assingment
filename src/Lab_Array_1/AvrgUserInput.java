package Lab_Array_1;
import java.util.Scanner;

public class AvrgUserInput {

    public static void main(String[] args) {

        System.out.println("Input the length of numbers: ");
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        double[] arr = new double[n];
        double total = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter Number " + (i + 1) + ":");
            arr[i] = scanner.nextDouble();
        }
        scanner.close();
        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i];
        }
        double average = total / arr.length;
        System.out.printf("The average of Number is: %.2f", average);

    }
}