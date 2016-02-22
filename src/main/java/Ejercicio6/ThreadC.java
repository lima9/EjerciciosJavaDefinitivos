package Ejercicio6;

/**
 * Created by lima on 2/21/16.
 */
public class ThreadC implements Runnable
{
    private Buffer buffer = null;

    public ThreadC (Buffer buffer)
    {
        this.buffer = buffer;
    }

    public void run()
    {
        StringBuilder SB = new StringBuilder();
        char c;
        while ((c = buffer.get()) != '\n'){
            System.out.println(Thread.currentThread().getName() + " reads " + c);
            SB.append(c);
        }
        System.out.println(SB);
    }
}

