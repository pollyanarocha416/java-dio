package edu.polly.setimasemana.collectionsjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class colecoes {
    // interface List
    // java.util.list
    // elementos duplicados e garante ordem de insercao
    //usar o ArrayList quando se presisa buscar muitos item
    public static void main(String[] args) {
        List<Double> notas = new ArrayList<Double>();
        notas.add(9.6);
        notas.add(4.1);
        notas.add(8.5);
        notas.add(4.1);
        notas.add(9.0);
        notas.add(2.4);
        notas.add(1.6);
        notas.add(9.6);
        System.out.println(notas);



        System.out.println("exibir a posicao da nota 9.6: "+ notas.indexOf(9.6));

        System.out.println("Adcione na lista a nota 0.0 na posicao 4: ");
        notas.add(0, 0.0);
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(4.1), 6.0);
        System.out.println(notas);
    }

}
