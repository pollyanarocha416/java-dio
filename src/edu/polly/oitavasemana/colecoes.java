package edu.polly.oitavasemana;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
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

        System.out.println("exiba a terceira nota add " + notas.get(2));
        System.out.println(notas.toString());

        System.out.println("Exiba a menor nota: "+ Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));


        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma: " + soma);

        System.out.println("Exiba a media: " + (soma/notas.size()));

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova a nota na posicao 0: ");
        notas.remove(0);
        System.out.println(notas);

        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7) {
                iterator1.remove();
            }System.out.println(notas);
        }
        System.out.println("apagar a lista");
        notas.clear();
        System.out.println(notas);

        System.out.println("Confira se a lista esta vazia: "+ notas.isEmpty());

    }

}
