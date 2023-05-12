package AreaCilindro;

public class Main
{
    public static void main(String args[])
    {
        AreaCilindro cilindro = new AreaCilindro(); //instancia
        cilindro.setR(8 /*argumento*/);
        cilindro.setH(7 /*argumento*/);
        System.out.println(cilindro.obtenerAreaTotalCil());
    }
}
