package Ejercicio5;

import java.util.Calendar;
import java.util.Random;

/**
 * Created by lima on 2/21/16.
 */
public class ThreadHeredado extends Thread
{
    int ThreadNum;
    double ms = 0.0;
    double Ams = 0.0;
    double Actualms = 0.0;
    double Previousms = 0.0;

    Random RandomGen = new Random();

    public void run()
    {
        for (int i = 0; i < 10; i++)
        {
            Calendar Calendar = java.util.Calendar.getInstance();
            Actualms = Calendar.get(Calendar.MILLISECOND);

            Ams = Math.abs(Actualms - Previousms);

            System.out.println("Este es el THREAD RUNNABLE: " + ThreadNum +
                    "\nTiempo transcurrido desde el último THREAD RUNNABLE: " + Ams + " ms");

            Previousms = Actualms;

            try
            {
                sleep(RandomGen.nextInt(2000));
            }
            catch (InterruptedException e)
            {

            }
            ThreadNum++;
        }
    }
}

/*
int numero_escrituras;
    String ultimo_tiempo;
    int milisegundos = 0;
    int diferenciamilis=0;
    int milisactuales=0;
    int milisanterior= 0;
    Random randomGenerator = new Random();

    @Override
    public void run(){



        for(int i =0;i<10;i++){
            Calendar cal = Calendar.getInstance();
            milisactuales = cal.get(Calendar.MILLISECOND);

            diferenciamilis = Math.abs(milisactuales - milisanterior);

            System.out.println("THREAD " +diferenciamilis+ "ms  Escrituras:"+numero_escrituras);

            milisanterior = milisactuales;

            try {
                sleep(randomGenerator.nextInt(2000));
            } catch (InterruptedException e) {

            }
            numero_escrituras++;
        }


    }
 */