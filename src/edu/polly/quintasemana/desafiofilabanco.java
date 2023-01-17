package edu.polly.quintasemana;

import java.util.Scanner;

public class desafiofilabanco {
    public static void main(String[] args) {

        String[] nomesFila = new String[3];
        Scanner nome = new Scanner(System.in);

        // posição do cliente na fila:
        for (int i = 0; i < nomesFila.length; i++) {
            nomesFila[i] = nome.nextLine();
            System.out.println(nomesFila[i] + " - esta na posicao: " + (i + 1));
        }
        nome.close();
    }
}
