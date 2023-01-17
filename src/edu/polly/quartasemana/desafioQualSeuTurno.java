package edu.polly.quartasemana;

import java.util.Scanner;
public class desafioQualSeuTurno {
    public static void main(String[] args) {
       


        Scanner leitor = new Scanner(System.in);
        System.out.println("qual o seu turno? ");

        char turno = leitor.next().toUpperCase().charAt(0);
        
        
        char m = 'M';
        char n = 'N';
        char v = 'V';
        if(turno == m){
          System.out.println("Bom Dia!");  
        }
        else if (turno == v) {
          System.out.println("Boa Tarde!");
        }
        else if (turno == n) {
          System.out.println("Boa Noite!");
        }
        else{
          System.out.println("Valor Inválido!");
        }
      }
    }
    

