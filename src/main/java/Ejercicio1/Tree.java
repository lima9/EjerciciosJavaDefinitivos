package Ejercicio1;

/**
 * Created by lima on 2/20/16.
 */
public class Tree
{
    public Tree()
    {
     System.out.println("Un árbol");
    }
    public Tree(int altura)
    {
        System.out.println("Un árbol de " + altura + " metros");
    }
    public Tree(String nombre)
    {
        System.out.println("Un " + nombre);
    }
    public Tree(int altura, String nombre)
    {
        System.out.println("Un " + nombre + " de " + altura + " metros");
    }
}
