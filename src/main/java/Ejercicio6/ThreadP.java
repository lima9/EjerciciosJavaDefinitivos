package Ejercicio6;

/**
 * Created by lima on 2/21/16.
 */
public class ThreadP implements Runnable
{
    private Buffer buffer = null;
    private String line = null;

    public ThreadP (Buffer buffer, String line)
    {
        this.buffer = buffer;
        this.line = line;
    }

    public void run()
    {
        char chars[] = line.toCharArray();
        for( char c : chars)
        {
            buffer.put(c);
            System.out.println(Thread.currentThread().getName() + " writes " + c);
        }
    }
}

/*
public class ThreadP implements Runnable {
    private Buffer buffer = null;
    private String line = null;

    public ThreadP (Buffer buffer, String line) {
        this.buffer = buffer;
        this.line = line;
    }

    @Override
    public void run() {
        char chars[] = line.toCharArray();
        for (char c : chars) {
            buffer.put(c);
            // Uncomment to log what is writing the thread
            // System.out.println(Thread.currentThread().getName() + " writes " + c);
        }
    }

*/