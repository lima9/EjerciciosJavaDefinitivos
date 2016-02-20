/**
 * Created by lima on 2/18/16.
 */
package Ejercicio1;

import java.util.Scanner;

public class App {

    public static void main(String[] args)
    {

        Tree[] arboles  = new Tree[4];
        arboles[0] = new Tree(4);
        arboles[1] = new Tree("Roble");
        arboles[2] = new Tree();
        arboles[3] = new Tree(5,"Pino");

        System.out.printf("%d\n%s\n%s\n%s%d",
                arboles[0],arboles[1],arboles[2],arboles[3]);


 }

}