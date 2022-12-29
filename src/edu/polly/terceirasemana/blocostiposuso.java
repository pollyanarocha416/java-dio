package edu.polly.terceirasemana;

public class blocostiposuso {
    public static void main(String[] args) {
//      blocos sao tipo:
        int num = 5;
//      eles nao tem {} pq so tem uma linha
//      sendo execultada
//      um bloco        
        if(num <= 1)
            System.out.println("menor q 1");
        else if(num > 1)
            System.out.println("maior q 1");
//      um bloco
        for (int i = 1; i < num; i++) {
            System.out.println(i);
        }
    }
}
