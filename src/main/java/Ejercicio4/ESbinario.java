package Ejercicio4;

/**
 * Created by lima on 2/21/16.
 */
import java.io.*;

public class ESbinario
{

        int entero;
        double decimal;
        char caracter;
        static File fichero;
        final static String ruta_guardado ="Binario.txt";

        public static void main(String[] args) throws IOException{

            escribirFicheroBinario(3,2.3,'t');
            leerFicheroBinario(ruta_guardado);

        }
        public static void escribirFicheroBinario(int entero, double d, char c) throws IOException{

            DataOutputStream dos = new DataOutputStream(new FileOutputStream(ruta_guardado));
            dos.writeInt(entero);
            dos.writeDouble(d);
            dos.writeChar(c);
            dos.close();

        }

        public static void leerFicheroBinario(String ruta_fichero) throws IOException{

            DataInputStream dis = new DataInputStream(new FileInputStream(ruta_fichero));

            int numero = dis.readInt();
            double decimal = dis.readDouble();
            char caracter = dis.readChar();

            System.out.println("NUMERO : "+numero);
            System.out.println("CARACTER : "+caracter);
            System.out.println("DECIMAL : "+decimal);

        }

    }
