package edu.polly.primeirasemana;
public class Operadores {
    public static void main(String[] args){
        // para o char tem q ser ''
        // operadores:
        // atribuicao =
        // maior >
        //menor <
        // maior igual 
        String nomCompleto = "Linguagem " + "java";
        System.out.println(nomCompleto);
        // operador unario -, +, ++ incremento, -- decremento, ! negacao:
        int num = 5;
        // tornar o num negativo:
        num = - num;
        System.out.println(num);
        // tornar o num positivo:
        num = num * -1;
        System.out.println(num);

        // incremento de numero:
        // repeticao de valor
        int numeros = 5;
        numeros++; // numeros + 1
        System.out.println(numeros);

        boolean variavel = true;
        System.out.println(!variavel);
        //reatribuir o valor dela pra q seja falsa:
        System.out.println(variavel);
        variavel = !variavel;
        System.out.println(variavel);
    }
}