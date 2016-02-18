package TestInicial;

import TestInicial.Account;

import java.util.Scanner;

public class AccountTest
{

    public static void main(String[] args)
    {
        Account acc1 = new Account(654.40);
        Account acc2 = new Account(-65.40);

        System.out.printf("acc1 balance: $%.2f\n",
                acc1.getBalance());
        System.out.printf("acc2 balance: $%.2f\n",
                acc2.getBalance());

        Scanner input = new Scanner(System.in);
        double DepositAmount;

        System.out.print("Enter acc1 amount: ");
        DepositAmount = input.nextDouble();
        System.out.printf("\nadding %.2f to acc1 balance\n\n",
                DepositAmount);
        acc1.credit(DepositAmount);

        System.out.printf("acc1 balance: $%.2f\n",
                acc1.getBalance());
        System.out.printf("acc2 balance: $%.2f\n",
                acc2.getBalance());

        System.out.print("Enter acc2 amount: ");
        DepositAmount = input.nextDouble();
        System.out.printf("\nadding %.2f to acc1 balance\n\n",
                DepositAmount);
        acc2.credit(DepositAmount);

        System.out.printf("acc1 balance: $%.2f\n",
                acc1.getBalance());
        System.out.printf("acc2 balance: $%.2f\n",
                acc2.getBalance());
    }
}