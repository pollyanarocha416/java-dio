package edu.polly.oitavasemana.collectionsjava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * exercicioTemperatura
 */
/* public class exercicioTemperatura {
    public static void main(String[] args) {
        // fazer um programa que recebe a temperatura media
        // dos 6 primei meses do ano e armazerna numa lista
        // calcular a media semestral das temperatura 
        // mostrar as temperaturas acima desta media,
        // e em que mes ocorreram
        List<Double> mediaTemperatura = new ArrayList<Double>();

        System.out.println("Digite a temperatura media do mes 1: ");


    }
    
} */

// perguntar sobre um crime:
// telefonou para a vitima ?
// esteve no local?
// mora perto da vitima?
// devia para a vitima?
// ja trabalhou com a vitima?
// 2 sims suspeita
// entre 3 e 4 como cumplice
// maior que isso Assassina
// caso contrario inocente

// sem Array list
class Suspeitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int telefonou = 0, esteveLocal = 0, moraPerto = 0, devia = 0, trabalhouCom = 0, quantidadeSims = 0;

        System.out.println("Telefonou para a vítima? (sim - 1 / não - 0)");
        telefonou = sc.nextInt();

        System.out.println("Esteve no local do crime? (sim - 1 / não - 0)");
        esteveLocal = sc.nextInt();

        System.out.println("Mora perto da vítima? (sim - 1 / não - 0)");
        moraPerto = sc.nextInt();

        System.out.println("Devia para a vítima? (sim - 1 / não - 0)");
        devia = sc.nextInt();

        System.out.println("Já trabalhou com a vítima? (sim - 1 / não - 0)");
        trabalhouCom = sc.nextInt();

        quantidadeSims = telefonou + esteveLocal + moraPerto + devia + trabalhouCom;

        if (quantidadeSims == 2) {
            System.out.println("vc é suspeito");
        } else if (quantidadeSims >= 3 && quantidadeSims <= 4) {
            System.out.println("vc é cúmplice");
        } else if (quantidadeSims > 4) {
            System.out.println("vc é o assassino");
        } else {
            System.out.println("vc é inocente");
        }
    }
}
