package br.com.dio;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        /*System.out.println("Área do quadrado:" + Quadrilatero.area(5));
        System.out.println("Área do retangulo:" + Quadrilatero.area(5d, 10d));
        System.out.println("Área do trapézio:" + Quadrilatero.area(10, 5, 15));
        System.out.println("Área do losango:" + Quadrilatero.area(10f, 5f));
    */
        double areaQuadrado = Quadrilatero.area(5);
        System.out.println("Área do quadrado:" + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(5d, 10d);
        System.out.println("Área do retangulo:" + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(10, 5, 15);
        System.out.println("Área do trapézio:" + areaTrapezio);

        float areaLosango = Quadrilatero.area(10f, 5f);
        System.out.println("Área do losango:" + areaLosango);
    }
}
