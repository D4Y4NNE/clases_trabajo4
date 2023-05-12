package TeoremaCoseno;

public class Main
{
    public static void main(String args[])
    {
        Teorema teorema = new Teorema();
        teorema.setA(4);
        teorema.setB(6);
        teorema.setAlfa(45);
        System.out.println(teorema.obtenerCoseno());
    }
}
