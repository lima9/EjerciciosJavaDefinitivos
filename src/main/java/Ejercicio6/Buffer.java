package Ejercicio6;

/**
 * Created by lima on 2/21/16.
 */



public class Buffer
{
    private final static int BUFFER_SIZE = 32;
    private char[] buffer;
    private int start;
    private int end;

    public Buffer()
    {
        buffer = new char[BUFFER_SIZE];
        this.end = 0;
        this.start = 0;
    }

    public synchronized char get() {
        char c = 0;
        while (isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
            }

            c = buffer[start++];

            if (start == buffer.length) {
                start = 0;
            }
        }
        notifyAll();
        return c;
    }

    public synchronized void put(char c)
    {
        while (isFull())
        {
            try
            {
                wait();
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }

            buffer[end++] = c;

            if (end == buffer.length)
            {
                end = 0;
            }
        }
        notifyAll();
    }

    private boolean isEmpty()
    {
        return start == end;
    }

    private boolean isFull()
    {
        if (end + 1 == start)
        {
            return true;
        }
        else if (end == (buffer.length -1) && start == 0)
        {
            return true;
        }
        return false;
    }
}

