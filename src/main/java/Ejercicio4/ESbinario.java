package Ejercicio4;

/**
 * Created by lima on 2/21/16.
 */
import java.io.*;

public class ESbinario
{

    public int getEntero() {
        return entero;
    }

    int entero;
        double decimal;
        char caracter;

        static File fichero;

        final static String ruta_guardado ="/home/lima/Desktop/Binario";

        public static void main(String[] args) throws IOException{

            escribirFicheroBinario(ruta_guardado, 3,2.3,'t');
            ESbinario esb = leerFicheroBinario(ruta_guardado);
            System.out.println(esb.caracter);
            System.out.println(esb.entero);
            System.out.println(esb.decimal);



        }
        public static void escribirFicheroBinario(String ruta, int enteros, double d, char c) throws IOException{

            DataOutputStream dos = new DataOutputStream(new FileOutputStream(ruta_guardado));
            dos.writeInt(enteros);
            dos.writeDouble(d);
            dos.writeChar(c);
            dos.close();
            fichero = null;
        }

        public static ESbinario leerFicheroBinario(String ruta_fichero) throws IOException{

            DataInputStream dis = new DataInputStream(new FileInputStream(ruta_fichero));

            ESbinario esb = new ESbinario();

            esb.entero = dis.readInt();
            esb.decimal = dis.readDouble();
            esb.caracter = dis.readChar();

            return esb;



        }

    }
