package TestInicial; /**
 * Created by lima on 2/18/16.
 */
import java.util.Scanner;

public class Comparison {
    public static void main (String[] args )
    {
    Scanner input = new Scanner(System.in);

    int n1;
    int n2;

    System.out.print("Enter 1rst integer: ");
    n1 = input.nextInt();

        System.out.print("Enter 2nd integer: ");
        n2 = input.nextInt();

        if (n1 == n2)
            System.out.printf("%d == %d\n", n1, n2);
        if (n1 != n2)
            System.out.printf("%d != %d\n", n1, n2);
        if (n1 < n2)
            System.out.printf("%d < %d\n", n1, n2);
        if (n1 > n2)
            System.out.printf("%d > %d\n", n1, n2);
        if (n1 <= n2)
            System.out.printf("%d <= %d\n", n1, n2);
}
}