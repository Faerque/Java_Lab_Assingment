package Lab_Array_3;

import java.util.Scanner;

public class ModifyArrayMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr=new int[10];

        System.out.println("Enter 10 array elements: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i]=input.nextInt();
        }

        System.out.println("Before modified the array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        ModifyArray ob = new ModifyArray();
        ob.modify(arr);

    }


}
