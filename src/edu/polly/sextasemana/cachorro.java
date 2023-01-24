package edu.polly.sextasemana;

public class cachorro {
    String pata;
    String rabo;
    String boca;


    cachorro(String pata, String rabo, String boca){
        this.pata = pata;
        this.rabo = rabo;
        this.boca = boca;
    }

    void setPata(String pata) {
        this.pata = pata;
    }

    String getPata() {
        return pata;
    }

    void setrabo(String rabo) {
        this.rabo = rabo;
    }

    String getrabo() {
        return rabo;
    }

    void setboca(String boca) {
        this.boca = boca;
    }

    String getboca() {
        return boca;
    }

    @Override
    public String toString() {
        return "A pata está em: " + pata + ", o rabo está: "+rabo+", a boca esta: "+boca+".";

    }

    public static void main(String[] args) {
        cachorro belinha = new cachorro("movimento", "balançando", "emitindo som");
        System.out.println(belinha);
    }
}
