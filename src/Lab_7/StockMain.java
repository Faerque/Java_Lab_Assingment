package Lab_7;
import java.util.Scanner;

public class StockMain {

    public static void main(String[] args) {

        int buy;
        int sell;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter total Buy");
        buy = input.nextInt();
        System.out.println("Enter total Sell");
        sell = input.nextInt();

        StockCalculation availableStock = new StockCalculation(100);

        availableStock.buy(buy);
        availableStock.sell(sell);

        availableStock.show();

    }

}