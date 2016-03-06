package Ejercicio6new;

import java.util.ArrayList;
import java.util.List;

public class ThreadP implements Runnable
{


    private Buffer buffer;
   // private List<Character> lista;
    private final String cadena = "una frase\n";

    public ThreadP(Buffer buffer)
    {
        this.buffer = buffer;
        //lista = new ArrayList<Character>();
    }

    public void run()
    {
        for (int i = 0;i<cadena.length();i++)
        {
            buffer.escritura(cadena.charAt(i));
        }


    }
}
