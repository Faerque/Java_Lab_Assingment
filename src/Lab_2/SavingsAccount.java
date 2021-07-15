package Lab_2;

public class SavingsAccount {

    private double balance;


    public SavingsAccount()
    {
        balance = 0;

    }

    // Initial Balance
    public SavingsAccount(double initialBalance)
    {
        balance = initialBalance;

    }

    // Declaring deposit method
    public void deposit(double amount)
    {
        balance = balance + amount;
    }

    // Declaring withdraw method
    public void withdraw(double amount)
    {
        balance = balance - amount;
    }


    public double getBalance()
    {
        return balance;
    }


}