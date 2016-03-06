package Ejercicio5;

import java.util.Calendar;
import java.util.Random;

import static java.lang.Thread.sleep;

/**
 * Created by lima on 2/21/16.
 */
public class RunnableInterface implements Runnable
{

    int ThreadNum;
    double ms = 0.0;
    double Ams = 0.0;
    double Actualms = 0.0;
    double Previousms = 0.0;

    Random RandomGen = new Random();

    public RunnableInterface(){}

    public void run() {
        for (int i = 0; i < 10; i++) {
            Calendar Calendar = java.util.Calendar.getInstance();
            Actualms = Calendar.get(Calendar.MILLISECOND);

            Ams = Math.abs(Actualms - Previousms);

            System.out.println("Este es el THREAD: " + ThreadNum +
                    "\nTiempo transcurrido desde el último THREAD: " + Ams + " ms");

            Previousms = Actualms;

            try
            {
                sleep(RandomGen.nextInt(20));
            }
            catch (InterruptedException e)
            {}
            ThreadNum++;
        }
    }
}
