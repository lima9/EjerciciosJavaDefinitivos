package Ejercicio2;

/**
 * Created by lima on 2/20/16.
 */

import java.lang.Math;

public class Circle
{
    double radio;

    public Circle (double radio)
    {
        //super("circle");
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double area ()
    {
        return (Math.PI *radio*radio);
    }

}
