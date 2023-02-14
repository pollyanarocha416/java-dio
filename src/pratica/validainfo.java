package pratica;

import java.util.Scanner;

/* Faça um programa que leia e valide as seguintes informações:
Nome: maior que 3 caracteres; */
/**
 * validainfo
 */
/* 
 Idade: entre 0 e 150;
Salário: maior que zero;
Sexo: 'f' ou 'm';
Estado Civil: 's', 'c', 'v', 'd'; */
public class validainfo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Insira o seu nome: ");
        String name = input.nextLine();

        while (name.length() <= 3) {
            System.out.println("Nome inválido. Por favor, insira um nome com mais de 3 caracteres.");
            System.out.print("Insira o seu nome: ");
            name = input.nextLine();
        }

        System.out.println("Nome válido. Obrigado por inserir o seu nome.");
        
        // idade entre 0 150:
        System.out.print("Insira o sua idade: ");
        int idade = input.nextInt();

        while (idade < 0 | idade > 150) {
            System.out.println("Idade inválida. Por favor, insira uma idade entre zero e cento e sinquenta.");
            System.out.print("Insira o sua idade: ");
            idade = input.nextInt();
        }

        System.out.println("Idade Valida. Obrigado por inserir a sua idade.");
    
        // salario maior q 0
        System.out.print("Insira o seu salario: ");
        Double salario = input.nextDouble();

        while (salario < 600) {
            System.out.println("Salario inválido. Por favor, insira um salario com mais de 3 caractere.");
            System.out.print("Insira o seu salario: ");
            salario = input.nextDouble();
        }

        System.out.println("Salario válido. Obrigado por inserir o seu salario.");

        System.out.println("Digite seu sexo: [f | m]");
        String sexo = input.nextLine();
         while (sexo == "f" | sexo == "m") {
            System.out.println("sexo invalido, digite: f ou m");
            System.out.println("insira seu sexo: ");
            sexo = input.nextLine();
         }System.out.println("sexo valido");

         // Estado Civil: 's', 'c', 'v', 'd'
         System.out.println("Digite seu estaado civil: [s | c | v | d ]");
         String estadoCivil = input.nextLine();
         while (estadoCivil == "s" | estadoCivil == "c" | estadoCivil == "v" | estadoCivil == "d") {
             System.out.println("estado civil invalido, digite: s, c, v ou d");
             System.out.println("insira seu estado civil: ");
             estadoCivil = input.nextLine();
         }
         System.out.println("estado civil valido");

    }
}
