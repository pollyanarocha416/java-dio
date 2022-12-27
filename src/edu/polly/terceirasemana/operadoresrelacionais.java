package edu.polly.terceirasemana;

public class operadoresrelacionais {
    public static void main(String[] args) {
        // operador de relacao:
        int i1 = 10;
        float f1 = 4.5F;
        double d1 = 59.6d;
        char c1 = 'x';
        String s1 = "Fulano";
        boolean t1 = true;
        byte y1 = 1;
        short h1 = 25;
        long l1 = 1597L;
        // nao tem como comparar tipos de dados diferente
        // posso comparar numeros de tipos diferentes
        System.out.println(""+(y1 > h1)); // posso comporar byte e short
        System.out.println(" "+ (l1 > i1));
        System.out.println(" "+ (f1 <= d1));
    }

}
