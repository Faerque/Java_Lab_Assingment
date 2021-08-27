package Lab_Array_5;

import java.util.Scanner;

public class TwoDArrayMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the row number: ");
        int row=input.nextInt();
        System.out.println("Enter the column number: ");
        int col=input.nextInt();

        int[] a=new int[5];


        int[][] arr=new int[row][col];

        TwoDArray ob=new TwoDArray();
        System.out.println("Enter the 2D array elements: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        ob.sum(arr);
        ob.PrintedArray(arr);
        ob.Average(row,col);
        ob.Max(arr);
        ob.Min(arr);
    }

}
