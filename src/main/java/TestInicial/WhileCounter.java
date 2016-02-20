package TestInicial;

/**
 * Created by lima on 2/19/16.
 */
public class WhileCounter
{
    public static void main(String[] args)
    {
        int counter = 1;

        while (counter <= 1000)
        {
            System.out.printf("%d\n", counter);
            counter++;
        }
        System.out.println();
    }
}
