package edu.polly.oitavasemana.collectionsjava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class exercicio {
    /**
     * @param args
     */
    public static void main(String[] args) {

        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("jon", 18, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("jon", 12, "preto"));
        }};
        System.out.println(meusGatos);

        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("Ordem idade: ");
        Collections.sort(meusGatos, new ComparetorIdade());
        meusGatos.sort(new ComparetorIdade());
        System.out.println(meusGatos);

        System.out.println("Ordem por cor: ");
        Collections.sort(meusGatos, new ComparetorCor());
        meusGatos.sort(new ComparetorCor());
        System.out.println(meusGatos);

        meusGatos.sort(new Comparator<? super Gato>());
        System.out.println(meusGatos);

    }
}
    



class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Gato [nome=" + nome + ", idade=" + idade + ", cor=" + cor + "]";
    }

    @Override
    public int compareTo(Gato gato) {

        return this.getNome().compareToIgnoreCase(gato.getNome());
    }

    
}

class ComparetorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }

}

class ComparetorCor implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }

}
