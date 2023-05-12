package Hipotenusa;

import static java.lang.Math.sqrt;
public class Hipotenusa
{
    public double a;
    public double b;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b)
    {
        this.b = b;
    }

    public double obtenerHipotenunsa()
    {
        double hipotenusa;
        hipotenusa = sqrt(getA()*getA()+getB()*getB());
        return hipotenusa;
    }
}
