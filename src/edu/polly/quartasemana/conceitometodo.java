package edu.polly.quartasemana;

// tudo q e execultado vai ser nos metodos


// metodo principal
public class conceitometodo {
    public static void main(String[] args) {
        conceitometodo.fazer(5);
        conceitometodo.somar(5, 6);
        conceitometodo.subtrair(5, 6);
        conceitometodo.multiplicar(5, 6);
        conceitometodo.dividir(5, 6);
    }
        // metodo publico do tipo string 
   
    public static void fazer(int i){
        i = i + 10;
        System.out.println("val de i: " + i);
    }
    public static int somar(int a, int b){
        return a + b;
    }
    
    public static int subtrair(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static int dividir(int a, int b) {
        return a / b;
    }

    public static void manhan(String saldacao){
        saldacao = "bom dia";
        System.out.println(saldacao);
    }
    
}