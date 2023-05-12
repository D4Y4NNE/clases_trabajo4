package Rombo;

public class Rombo
{
    public int a;
    public int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int obtenerAreaRombo()
    {
        int areaRombo;
        areaRombo = getA()*getB()/2;
        return areaRombo;
    }
}
