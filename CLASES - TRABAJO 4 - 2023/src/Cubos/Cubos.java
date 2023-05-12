package Cubos;

public class Cubos
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
    public int obtenerCubo()
    {
        int cubos;
        cubos = getN()*getN()*(getN()+1)*(getN()+1)/4;
        return cubos;
    }
}
