package TestInicial; /**
 * Created by lima on 2/18/16.
 */
import java.util.Scanner;

public class Suma {

        public static void main(String[] args) {
           //Input from command windows
            Scanner input = new Scanner(System.in);

            int n1;
            int n2;
            int sum;

            System.out.print("Enter 1rst number: ");
            n1 = input.nextInt();

            System.out.print("Enter 2nd number*******: ");
            n2 = input.nextInt();

            sum = n1 + n2;

            System.out.printf("Sum is %d\n", sum);
        }



}
