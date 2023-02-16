package pratica;
/* 
Supondo que a população de um país A seja da ordem de 80000 
habitantes com uma taxa anual de crescimento de 3% e que a 
população de B seja 200000 habitantes com uma taxa de 
crescimento de 1.5%. Faça um programa que calcule e escreva 
o número de anos necessários para que a população do país 
A ultrapasse ou iguale a população do país B, 
mantidas as taxas de crescimento. */

public class TaxaCrescimento {
    public static void main(String[] args) {

        Double populacao_a = 80000.0;
        Double populacao_b = 200000.0;
        Double taxa_crescimento_a = 0.03;
        Double taxa_crescimento_b = 0.015;
        Double anos = 0.0;

        while (populacao_a < populacao_b) {
            anos += 1;
            populacao_a = populacao_a * (1 + taxa_crescimento_a);
            populacao_b = populacao_b * (1 + taxa_crescimento_b);
        }System.out.println("Serão necessários " + anos + " ano(s) para que a população de A ultrapasse ou iguale a população de B.");
    }
}
