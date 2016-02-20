package TestInicial;

/**
 * Created by lima on 2/19/16.
 */
public class Interest
{
    public static void main(String[] args )
    {
        double amount;
        double principal = 1500;
        double rate = 0.04;

        System.out.printf("%s%20s\n", "Year", "Amount on deposit");

        for (int year = 1; year <= 10; year++)
        {
            amount = principal * Math.pow(1.0 + rate, year);

            System.out.printf("%4d%,26.3f\n", year, amount);
        }
    }
}
