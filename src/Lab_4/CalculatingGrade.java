package Lab_4;
import java.util.Scanner;

public class CalculatingGrade {

    public static void main(String[] args) {

        {
            Scanner input = new Scanner(System.in);

            int passes = 0; // Number of passes student
            int failures = 0; // Number of failures student
            int studentCounter = 1;
            int result; // Obtain value from user

            while (studentCounter <= 10) {
                System.out.print("Press 1 for passed student and Press 2 for failed student: ");
                result = input.nextInt();

                if (result == 1) // if result == 1, increment the passes value
                    passes = passes + 1;
                else // if result is not 1, the it will increment failures value
                    failures = failures + 1;

                studentCounter = studentCounter +1;
            }

            System.out.printf("Passed: %d\nFailed:%d\n", passes, failures);

            if (passes > 8)
                System.out.println("Bonus to instructor");


        } }

}