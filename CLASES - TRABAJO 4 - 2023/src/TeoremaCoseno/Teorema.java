package TeoremaCoseno;
import static java.lang.Math.sqrt;
import static java.lang.Math.cos;

public class Teorema
{
    public float a;
    public float b;
    public float alfa;

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getAlfa()
    {
        return alfa;
    }

    public void setAlfa(float alfa)
    {
        this.alfa = alfa;
    }

    public double obtenerCoseno()
    {
        double coseno;
        coseno = sqrt(getA()*getA()+getB()*getB()-2*getA()*cos(alfa));
        return coseno;
    }
}
