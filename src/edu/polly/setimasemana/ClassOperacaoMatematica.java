package edu.polly.setimasemana;

public class ClassOperacaoMatematica implements OperacaoMatematica{
    @Override
    public void somar(int a, int b){
        System.out.println("resul: "+(a + b));
    }

    @Override
    public void subtrair(int a, int b) {
        System.out.println("resul: " + (a - b));
    }

    @Override
    public void multiplicar(int a, int b) {
        System.out.println("resul: " + (a * b));
    }

    @Override
    public void dividir(int a, int b) {
        System.out.println("resul: " + (a / b));
    }
    public static void main(String[] args) {
        ClassOperacaoMatematica copm = new ClassOperacaoMatematica();
        copm.somar(10, 10);
        copm.subtrair(10, 10);
        copm.multiplicar(10, 10);
        copm.dividir(10, 10);
    }
}
