package Ejercicio3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by lima on 2/20/16.
 */
public class EStexto
{
    public static void main(String[] args) throws FileParsingException, BigNumberException
    {
        double Average;
        Average = ReturnAverage("Numero<1000.txt");
        System.out.println("La media aritmética de los números leídos es: " + Average);

    }

    public static double ReturnAverage(String File) throws FileParsingException, BigNumberException
    {
        double Counter = 0.0;
        double Total = 0.0;
        double Average = 0.0;

        BufferedReader inputStream = null;

        try
        {
            inputStream = new BufferedReader(new FileReader(File));

            String Line;

            while ((Line = inputStream.readLine()) != null)
            {
                double number = Integer.parseInt(Line);

                if (number < 1000)
                {
                    Total = Total + number;
                }
                else
                {
                    throw new BigNumberException("Hay un número mayor que 1000 en la línia: " + (int)Counter
                    + "\nNo se puede continuar.");
                }
                Counter++;
            }

        }
        catch (FileNotFoundException e)
        {
            System.out.println("No se ha encontrado ningún fichero.");
        }

        catch(IOException e)
        {
            throw new FileParsingException(e.getMessage());
        }

        catch(NumberFormatException e)
        {
            throw new FileParsingException(e.getMessage());
        }

        catch (BigNumberException e)
        {
            System.out.println(e.getMessage());
            System.exit(1);
        }
        finally
        {
            try
            {
                inputStream.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }

        Average = Total / Counter;
        return Average;
    }
}
