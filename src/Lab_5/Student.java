package Lab_5;
import java.util.Scanner;

public class Student {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input Quantity of Students");

        int n = input.nextInt();
        int total = 0;
        int num;
        double avrg;

        int A = 0, B = 0, C = 0, D = 0, F = 0;

        for (int i = 0; i <n; i++){
            System.out.println("Input the Score");
            num = input.nextInt();
            total = total + num;
            int score = num;

            switch (score/10){
                case 10:
                case 9:
                    System.out.println("Grade A");
                    A++;
                    break;
                case 8:
                    System.out.println("Grade B");
                    B++;
                    break;
                case 7:
                    System.out.println("Grade C");
                    C++;
                    break;
                case 6:
                    System.out.println("Grade D");
                    D++;
                    break;
                default:
                    System.out.println("Failed");
                    F++;
            }
        }
        avrg = (double) total/(double) n;
        System.out.printf("Total score is: %d\n", total);
        System.out.printf("Average score is %.2f\n", avrg );
        System.out.println("Grade A: " +A);
        System.out.println("Grade B: " +B);
        System.out.println("Grade C: " +C);
        System.out.println("Grade D: " +D);
        System.out.println("Grade F: "+F);

    }

}
