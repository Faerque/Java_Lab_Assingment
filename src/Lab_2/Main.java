package Lab_2;

public class Main {

    public static void main(String[] args) {

        SavingsAccount OmarFaruk = new SavingsAccount(1000);
        OmarFaruk.withdraw(389);
        OmarFaruk.deposit(500);
        System.out.println(OmarFaruk.getBalance());

        SavingsAccount FarukOmar = new SavingsAccount(1250);
        FarukOmar.withdraw(1250);
        FarukOmar.deposit(00);
        System.out.println(FarukOmar.getBalance());

    }

}