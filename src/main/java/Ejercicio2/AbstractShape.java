package Ejercicio2;

import java.awt.*;

/**
 * Created by lima on 2/20/16.
 */
public abstract class AbstractShape implements Shape
{
    private String type;

    public AbstractShape(String type)
    {
        this.type = type;
    }

    @Override
    public String toString()
    {
        return "I'm a " + type;
    }
}