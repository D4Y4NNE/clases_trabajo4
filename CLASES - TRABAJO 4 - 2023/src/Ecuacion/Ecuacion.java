package Ecuacion;

public class Ecuacion
{
    public double a;
    public double b;


    public double getA()
    {
        return a;
    }

    public void setA(double a)
    {
        this.a = a;
    }

    public double getB()
    {
        return b;
    }

    public void setB(double b) //parametro
    {
        this.b = b;
    }

    public double obtenerEcuacion()
    {
        double ecuacion;
        ecuacion = -getB()/getA();
        return ecuacion;
    }
}
