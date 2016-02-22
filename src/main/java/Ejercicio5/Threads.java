package Ejercicio5;

/**
 * Created by lima on 2/21/16.
 */
public class Threads
{
    public static void main(String[] args) throws InterruptedException {

        ThreadHeredado TH = new ThreadHeredado();
        RunnableInterface RI = new RunnableInterface();

        Thread TH1 = new Thread(RI);

        TH.start();
        TH1.start();

        TH.join();
        TH1.join();
    }
}
