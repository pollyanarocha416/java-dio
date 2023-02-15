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
        int paisaAno1 = 8000;
        int paisbAno1 = 200000;

        Double paisaAno2 = 8000 * 0.3 + 8000;
        for (double i = paisaAno2; i < paisbAno1; i++) {
            System.out.println("pais a ultrapassou o pais b: "+ i);
        }


    }

}
