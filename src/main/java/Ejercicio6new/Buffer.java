package Ejercicio6new;

import static java.lang.Thread.sleep;

public class Buffer
{
    private char[] buffer = new char[32];
    private int nextchar = 0;

    public int getNextchar() {
        return nextchar;
    }

    public void setNextchar(int nextchar) {
        this.nextchar = nextchar;
    }

    public synchronized char lectura() {
        while (nextchar == 0)
        {
            try {
                sleep(100);
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        nextchar--;
        char c = buffer[nextchar];
        notify();
        return c;

    }
    // no son metodos de la clase no hay static
    // si son metodods de la clase si hay static

    public static void funcion2 (){}

    public synchronized void  escritura(char c)
    {
        while (nextchar > 31)
        {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        buffer[nextchar] = c;
        nextchar++;
        notify();

    }

}
