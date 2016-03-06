package Ejercicio6new;


import java.util.ArrayList;
import java.util.List;

public class ThreadC implements Runnable
{

    private Buffer buffer;

    private List <Character> lista;

    public ThreadC(Buffer buffer)
    {
        this.buffer = buffer;
        lista = new ArrayList<Character>();
    }

    public void run()
    {
        char c;
        do
        {
            c = buffer.lectura();
            lista.add(c);

        }
        while( c != '\n');

        for (char x:lista) {
            System.out.print(x);
        }

    }

}
