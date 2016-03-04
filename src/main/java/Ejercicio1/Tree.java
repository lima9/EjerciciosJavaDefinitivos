package Ejercicio1;

/**
 * Created by lima on 2/20/16.
 */
public class Tree
{


    private int altura;
    private String nombre;


    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tree()
    {
        this(0,"Un árbol");
        //System.out.println("Un árbol");
    }
    public Tree(int altura)
    {
        this(altura,"Un árbol");
        //System.out.println("Un árbol de " + altura + " metros");
    }
    public Tree(String nombre)
    {
        this(0,nombre);
        //System.out.println("Un " + nombre);
    }
    public Tree(int altura, String nombre)
    {
        this.altura = altura;
        this.nombre = nombre;
        //System.out.println("Un " + nombre + " de " + altura + " metros");
    }
}
