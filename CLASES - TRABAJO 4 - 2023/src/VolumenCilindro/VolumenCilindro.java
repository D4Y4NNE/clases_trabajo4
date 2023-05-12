package VolumenCilindro;

public class VolumenCilindro
{
    public double r;
    public double h;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double obtenerVolCilindro()
    {
        double volClindro;
        volClindro = 3.14149*getR()*getR()*getH();
        return volClindro;
    }
}
