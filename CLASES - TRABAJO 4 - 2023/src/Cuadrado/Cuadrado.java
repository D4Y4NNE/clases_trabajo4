package Cuadrado;

public class Cuadrado
{
    public int n;

    public int getN()
    {
        return n;
    }

    public void setN(int n)
    {
        this.n = n;
    }

    public int obtenerCuadrado()
    {
        int cuadrado;
        cuadrado = getN()*(getN()+1)*(2*getN()+1)/6;
        return cuadrado;
    }
}
