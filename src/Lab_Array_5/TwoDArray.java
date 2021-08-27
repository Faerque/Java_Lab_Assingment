package Lab_Array_5;

public class TwoDArray {

    int sum;
    public void sum(int[][] x){
        for (int[] x1 : x) {
            for (int j = 0; j < x1.length; j++) {
                sum = sum + x1[j];
            }
        }
        System.out.println("The sum is: "+sum);
    }
    public void PrintedArray(int[][] x){
        System.out.println("The printed array elements are: ");
        for (int[] x1 : x) {
            for (int j = 0; j < x1.length; j++) {
                System.out.print(x1[j] + " ");
            }
            System.out.println();
        }
    }
    public void Average(int row,int col){
        double x=(sum/(row*col));
        System.out.println("The average of the array is: "+x);
    }
    public void Max(int[][] x){
        int max=x[0][0];
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                if(x[i][j]>max){
                    max=x[i][j];
                }
            }
        }
        System.out.println("The maximum of the array is: "+max);
    }
    public void Min(int[][] x){
        int min=x[0][0];
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                if(x[i][j]<min){
                    min=x[i][j];
                }
            }
        }
        System.out.println("The minimum of the array is: "+min);
    }

}
