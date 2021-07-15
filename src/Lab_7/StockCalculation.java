package Lab_7;

public class StockCalculation {

    private int Stock;

    public StockCalculation (int collection)
    {
        Stock = collection;
    }
    public void buy (int product)
    {
        Stock = Stock + product;
    }
    public void sell (int product)
    {
        Stock = Stock - product;
    }

    public void show(){
        System.out.println("Available Stock: " +Stock);
    }


}