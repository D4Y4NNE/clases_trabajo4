package Areas;

public class Areas
{
    public double a;

    public double getA()
    {
        return a;
    }

    public void setA(double a)
    {
        this.a = a;
    }

    public double obtenerAreas()
    {
        double area;
        area = 2*getA()*getA();
        return area;
    }
}

