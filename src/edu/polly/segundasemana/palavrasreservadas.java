package edu.polly.segundasemana;

public class palavrasreservadas {
    //tipos primitivos classificacoes, escopo de uso, palavras opostas:
    // int, double etc..
    // palavras q estao sempre em minusculo
    public static void main(String[] args) {
        short num4 = -1;
        System.out.println(num4);
    }
    // public: qualquer outra class pode acessar o metodo
    public String texto(){
        return "";
    }

    // private:
    //private double numero(){
        //return 
    //}
    protected double valores(int valor, int valor2){
        return valor + valor2;
    }

    // void indica q nao tem retorno de valor
    // double: 34555, 3.45 mais valor q int(435, 4534, 34, etc..)
    // float e 3.14F
    // short: valor menor q int
    
}
