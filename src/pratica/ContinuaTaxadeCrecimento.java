package pratica;

import java.util.Scanner;
import java.util.InputMismatchException;
/* 
Altere o programa anterior permitindo ao 
usuário informar as populações e as taxas de 
crescimento iniciais.Valide a entrada e permita 
repetir a operação. */

public class ContinuaTaxadeCrecimento {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
try {
    System.out.print("Insira a populacao do pais A: ");
    Double populacao_a = input.nextDouble();

    System.out.print("Insira a taxa de crescimento do pais A: ");
    Double taxa_crescimento_a = input.nextDouble();

    System.out.print("Insira a populacao do pais B: ");
    Double populacao_b = input.nextDouble();

    System.out.print("Insira a taxa de crescimento do pais B: ");
    Double taxa_crescimento_b = input.nextDouble();

    Double anos = 0.0;

    while (populacao_a < populacao_b) {
        anos += 1;
        populacao_a = populacao_a * (1 + taxa_crescimento_a);
        populacao_b = populacao_b * (1 + taxa_crescimento_b);
    }

    System.out.println("Serão necessários " + anos
            + " ano(s) para que a população de A ultrapasse ou iguale a população de B.");
} catch (InputMismatchException e) {
    System.out.println("Erro: entrada inválida. Por favor, digite um número.");
}
}
}
