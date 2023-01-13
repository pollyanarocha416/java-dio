package edu.polly.quartasemana;

public class sobrecarga {
    //sobrecarga e quando vc muda o parametro do metodo
    // mas mantem o nome do metodo.

    //exemplo de sobrecarga:
    // eles presisam ter qtd de parametros diferentes
    public static void area(double lado){//1
        System.out.println("area do quadrado: " + lado * lado);
    }
    
    public static void area(double lado1, double lado2) {//2
        System.out.println("area do retangulo: " + lado1 * lado2);
    }

    public static void area(double baseMaior, double baseMenor, double altura) {//3
        System.out.println("area do trapezio: " + ((baseMaior+baseMenor)*altura) /2 );
    }


    public static void main(String[] args) {
        sobrecarga.area(2);
        sobrecarga.area(2, 2);
        sobrecarga.area(3, 2, 1);
    }
}
