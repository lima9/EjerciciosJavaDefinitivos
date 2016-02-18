package TestInicial;

/**
 * Created by lima on 2/18/16.
 */
public class Account {
    private double balance;

    public Account(double InitialBalance) {
        if (InitialBalance > 0.0) {
            balance = balance - InitialBalance;
        }
    }

    public void credit(double amount)
    {
        balance = balance + amount;
    }

    public double getBalance()
    {
        return balance;
    }
}
