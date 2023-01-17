package edu.polly.quintasemana;

import java.util.Scanner;

public class desafiofilabanco {
    public static void main(String[] args) {
    String[] nomesFila = new String[3]; 
    Scanner nome = new Scanner(System.in); 

    if(nomesFila == "Ana"){
      System.out.println(nome +" - esta na posicao: 1");
    }else if(nomesFila == "Sofia")
      System.out.println("{} - esta na posicao: 2");
    else{
      System.out.println("Lucas - esta na posicao: 3");
    }
}
