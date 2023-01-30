package edu.polly.setimasemana;

public class ClasseFilha2 extends ClasseMae{
    
    @Override
    void metodo1() {
        System.out.println("Método 1 da Classe Filha 2");
    }

    @Override // sobreescrever
    void metodo2() {
        System.out.println("Método 2 da Classe Filha 2");
    }
}
