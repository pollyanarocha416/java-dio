package pratica;

import java.util.Scanner;

public class MaiorVal {
    // Faça um programa que leia 5 números e informe a soma e a média dos números.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Lê 5 números do usuário
        System.out.println("Digite 5 números: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        double num4 = input.nextDouble();
        double num5 = input.nextDouble();

        double soma = num1 + num2 + num3 + num4 + num5;
        double media = soma / 5;

        // Exibe o resultado
        System.out.println("A soma dos números é: " + soma);
        System.out.println("A média dos números é: " + media);
       
    }
}
