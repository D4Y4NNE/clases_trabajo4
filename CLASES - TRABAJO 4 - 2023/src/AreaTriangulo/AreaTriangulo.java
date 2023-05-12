package AreaTriangulo;

public class AreaTriangulo
{
    public int a;
    public  int b;
    public int c;
    public int r;

    public int getA()
    {
        return a;
    }

    public void setA(int a)
    {
        this.a = a;
    }

    public int getB()
    {
        return b;
    }

    public void setB(int b)
    {
        this.b = b;
    }

    public int getC()
    {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getR()
    {
        return r;
    }

    public void setR(int r)
    {
        this.r = r;
    }
    public int obtenerAreaTri()
    {
        int areaTri;
        areaTri = (getA()+getB()+getC())*getR()/2;
        return areaTri;
    }
}
