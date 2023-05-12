package AreaCilindro;

public class AreaCilindro
{
    public double r;
    public double h;

    public double getR()
    {
        return r;
    }

    public void setR(double r /*parametro*/)
    {
        this.r = r;
    }

    public double getH()
    {
        return h;
    }

    public void setH(double h /*parametro*/)
    {
        this.h = h;
    }
    public double obtenerAreaTotalCil()
    {
        double areaCil;
        areaCil = 6.28*getR()*(getR()+getH());
        return areaCil;
    }
}
