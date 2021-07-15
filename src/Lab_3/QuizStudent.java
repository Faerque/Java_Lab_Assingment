package Lab_3;
import java.util.Scanner;


public class QuizStudent {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Total Number of Students : ");

        int n = input.nextInt();
        int total = 0;
        int number;
        double avrg;
        for(int i = 0; i<n;i++){
            System.out.println("Enter Score: ");
            number = input.nextInt();
            total = total + number;
            int marks = number;

            switch (marks/10){
                case 10:
                case 9:
                    System.out.println("Grade A");
                    break;
                case 8:
                    System.out.println("Grade B");
                    break;
                case 7:
                    System.out.println("Grade C");
                    break;
                case 6:
                    System.out.println("Grade D");
                    break;
                default:
                    System.out.println("Grade Fail");
            }
        }

        avrg = (double) total/(double) n;
        System.out.printf("Total Score is : %d\n", total);
        System.out.printf("Average Number is : %f\n", avrg);



    }
}