package Lab_Array_3;

public class ModifyArray {

    public void modify(int[] x)
    {
        for (int i = 0; i < x.length; i++) {

            x[i]=2*x[i];
        }

        System.out.println("After modified the array is: ");

        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }

    }

}
