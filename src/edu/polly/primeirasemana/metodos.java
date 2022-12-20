package edu.polly.primeirasemana;

import java.util.Scanner;
public class metodos {
    public static void main(String[] args) {
        System.out.println("");
        Scanner metodos = new Scanner(System.in);
        int val1, val2, val3;

        System.out.print("digite o valor 1: ");
        val1 = metodos.nextInt();

        System.out.print("digite o valor 2: ");
        val2 = metodos.nextInt();

        System.out.print("digite o valor 3: ");
        val3 = metodos.nextInt();


    }
    public double somar(int num1, int num2){
        return num1 + num2;
    }
    public void imprimir(String texto){
        
    }

    public double dividir(int dividendo, int divisor) throws Exception{
        return dividendo / divisor;
    }
    // nao e visivil pra os outros metodos
    private void metodoPrivado(){
        
    }
}
