package Lab_Array_4;

import java.util.Scanner;

public class StudentGradeMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] num=new int[10];

        int sum=0;

        StudentGrade ob=new StudentGrade();
        System.out.println("Enter the 10 student's grade: ");
        for (int i = 0; i < num.length; i++) {
            num[i]=input.nextInt();
            sum=sum+num[i];
        }
        int highest=num[0];
        for (int i = 0; i < 10; i++) {
            if(num[i]>highest){
                highest=num[i];
            }
        }
        int lowest=num[0];
        for (int i = 0; i < num.length; i++) {
            if(num[i]<lowest){
                lowest=num[i];
            }
        }
        ob.avg(sum/10);
        ob.highest(highest);
        ob.lowest(lowest);
    }

}
