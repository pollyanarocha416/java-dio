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

        // operadores relacionais:
        // ==, !=, >, >=, <, <=.
        int num1 = 1, num2 = 1;
        boolean simNao = num1 == num2;
        System.out.println("num1 e igual a num2? " + simNao);

        if (num1 != num2) {
            System.out.println("a nossa condicao e verdadeira");
        }else{
            System.out.println("e falsa");
        }

        String nomeUm = "polly";
        String nomeDois = "polly";
        System.out.println(nomeUm.equals(nomeDois));//pra comparar string

        // and && , or

        boolean c1 = true;
        boolean c2 = false;
        
        if (c1 && c2) {
            System.out.println("as duas sao verdade");
        }else{
            System.out.println("as duas NAO sao verdade");
        }
        if (c1||c2) {
            System.out.println("uma das duas e verdadeira");  
        }

        int condicao1 = 3, condicao2 = 4;
        if (condicao1 != condicao2 && (condicao1 < condicao2)) {
            System.out.println("as condicoes cumprem os dois requisitos");
        }
    }
}