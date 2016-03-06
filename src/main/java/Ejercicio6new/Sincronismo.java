package Ejercicio6new;

public class Sincronismo {
    private Buffer buffer;

    public Sincronismo() {

        buffer = new Buffer();

    }

    public void function() {
        Thread t1 = new Thread(new ThreadC(buffer));
        Thread t2 = new Thread(new ThreadP(buffer));

        t1.start();
        t2.start();
    }

    public static void main (String[] args)
    {
        Sincronismo s  =  new Sincronismo();
        s.function();
    }
}