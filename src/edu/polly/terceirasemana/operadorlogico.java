package edu.polly.terceirasemana;

public class operadorlogico {
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;
        boolean c1 = true;


        System.out.println("and "+(b1 && b2));
        System.out.println("and "+(b1 && c1));

        System.out.println("or "+(b1 || b2));
        System.out.println("or "+(b1 || c1));
        
        System.out.println("diferente "+(b1 ^ b2));
        System.out.println("diferente " +(b1 ^ c1));
    }
}
