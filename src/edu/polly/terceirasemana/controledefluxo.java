package edu.polly.terceirasemana;

public class controledefluxo {
    public static void main(String[] args) {
        // decisao: if, if else, if else if, switch e operador ternario
        int num = 5;

        if (num < 2) {
            System.out.println();
        }

        if (num > 4) {
            System.out.println();
        }else{
            System.out.println();
        }

        // nao pode ter um monte de if e elses um dentro
        // do outro

        // pra expressoes booleanas
        if (num <= 3) {
            System.out.println();
        }else if (num >= 4) {
            System.out.println();
        }else{
            System.out.println();
        }

        // e pra valor exato
        switch (num) {
            case 1:
                System.out.println("vale 1");
                break;
            case 3:
                System.out.println("vale dois");
            default: // e pra um valor invalido
                System.out.println("o valor estar entre 5 e 1");
                break;
        }
        // evitar usar o operador ternario

        // exemplo:
        int numero = 5;
        if(numero == 1){
            System.out.println("janeiro");
        }else if (numero == 2) {
            System.out.println("Fevereiro");
        } else if (numero == 2) {
            System.out.println("Fevereiro");
        } else if (numero == 2) {
            System.out.println("Fevereiro");
        } else if (numero == 2) {
            System.out.println("Fevereiro");
        }



        // repeticao: for, while, do while
        // interrupcao: break, continue e return
    }
}
