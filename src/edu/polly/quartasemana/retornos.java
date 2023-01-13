package edu.polly.quartasemana;

public class retornos {

    public static double area(double lado) {// 1
        return lado * lado;        
    }

    public static double area(double lado1, double lado2) {// 2
        return lado1 * lado2;
    }

    public static double area(double baseMaior, double baseMenor, double altura) {// 3
        return ((baseMaior+baseMenor)*altura) / 2;
    }


    public static void main(String[] args) {
        double areaQuadrado = retornos.area(5);
        System.out.println(areaQuadrado);
    }
}
