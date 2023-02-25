package edu.polly.decimasemana;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExemplos {
    public static void main(String[] args) {
        System.out.println("criar um conjunto e add as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5));
        System.out.println(notas.toString());

        //confirir se uma nota esta ali

        System.out.println("Confira se a nota 7 esta no conjunto: "+notas.contains(7d));

        //
        System.out.println("exiba tds as notas na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas);
        System.out.println(notas3);

        

        
        System.out.println("exiba o menor valor: " + Collections.min(notas));
    
        System.out.println("pra apagar o conjunto: ");
        notas.clear();
        System.out.println("pra conferir sse estar vazio: " + notas.isEmpty());

    }
}
