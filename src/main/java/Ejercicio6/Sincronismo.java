package Ejercicio6;

/**
 * Created by lima on 2/21/16.
 */
public class Sincronismo
{
    public static void main(String[] args) {
        String line = "Six started far placing saw respect females old. Civilly why how end viewing attempt related enquire visitor. Man particular insensible celebrated conviction stimulated principles day. Sure fail or in said west. Right my front it wound cause fully am sorry if.\n";
        Buffer buffer = new Buffer();
        Thread producer = new Thread(new ThreadP(buffer, line), "producer");
        Thread consumer = new Thread(new ThreadC(buffer), "consumer");

        consumer.start();
        producer.start();
    }
}
