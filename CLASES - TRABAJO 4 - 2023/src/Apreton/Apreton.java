package Apreton;
public class Apreton
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
    public int obtenerApreton()
    {
        int apreton;
        apreton = getN()*(getN()-1)/2;
        return apreton;
    }
}