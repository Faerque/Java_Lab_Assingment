package Lab_6;
import java.util.Scanner;

public class MaxMini {

    public int maximum (int a, int b, int c)
    {
        return Math.max(a,Math.max(b,c));
    }
    public int minimum (int a, int b, int c)
    {
        return Math.min(a,Math.min(b,c));
    }
    public void MaxMini()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Input 1st Number");
        int num1 = input.nextInt();
        System.out.println("Input 2nd Number");
        int num2 = input.nextInt();
        System.out.println("Input 3rd Number");
        int num3 = input.nextInt();

        int maximum = maximum(num1,num2,num3);
        int minimum = minimum(num1,num2,num3);

        System.out.println("maximum number is "+maximum);
        System.out.println("minimum number is "+minimum);
    }

}