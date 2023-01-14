package edu.polly.quartasemana;

import java.util.Scanner;
public class desafioQualSeuTurno {
    public static void main(String[] args) {
       


        Scanner leitor = new Scanner(System.in);

        char turno = leitor.next().toUpperCase().charAt(0);

        char m = 'M';
        char n = 'N';
        if(turno == m){
          System.out.println("Bom Dia!");  
        }
        else if(turno == n){
          System.out.println("Boa Noite!");
        }
        else{
          System.out.println("Valor Inválido!");
        }
      }
    }
    

