package Suma;

public class Suma
{
    public int n;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int obtenerSuma()
    {
        int suma;
        suma = getN()*(getN()+1)/2;
        return suma;
    }
}
