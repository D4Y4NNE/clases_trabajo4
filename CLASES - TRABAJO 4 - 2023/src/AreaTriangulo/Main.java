package AreaTriangulo;

public class Main
{
    public static void main(String args[])
    {
        AreaTriangulo triangulo = new AreaTriangulo();
        triangulo.setA(3);
        triangulo.setB(5);
        triangulo.setC(6);
        triangulo.setR(9);
        System.out.println(triangulo.obtenerAreaTri());
    }
}
