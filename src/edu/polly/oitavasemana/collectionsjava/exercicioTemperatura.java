package edu.polly.oitavasemana.collectionsjava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * exercicioTemperatura
 */
public class exercicioTemperatura {
    public static void main(String[] args) {
        // fazer um programa que recebe a temperatura media
        // dos 6 primei meses do ano e armazerna numa lista
        // calcular a media semestral das temperatura 
        // mostrar as temperaturas acima desta media,
        // e em que mes ocorreram
        List<Double> mediaTemperatura = new ArrayList<Double>();

        System.out.println("Digite a temperatura media do mes 1: ");


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
        Scanner leitor = new Scanner(System.in);
        List<Double> assassino = new ArrayList<Double>();
        System.out.println("--------Quem assassinou fulano?????-------");
        System.out.println("!!!!!Responda com sim ou nao!!!!!!");
        System.out.println("Vc telefonou para a vitima ? ");
        String p1 = leitor.nextLine();

        System.out.println("esteve no local? ");
        String p2 = leitor.nextLine();

        System.out.println("mora perto da vitima? ");
        String p3 = leitor.nextLine();

        System.out.println("devia para a vitima? ");
        String p4 = leitor.nextLine();

        System.out.println("ja trabalhou com a vitima? ");
        String p5 = leitor.nextLine();


        


    }
    
}