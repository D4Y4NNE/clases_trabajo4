package Ecuacion;

public class Main
{
    public static void main(String args[])
    {
        Ecuacion ecuacion = new Ecuacion(); // instancia xq llamo a una clase
        ecuacion.setB(4);
        ecuacion.setA(2);
        System.out.println(ecuacion.obtenerEcuacion());
    }
}
