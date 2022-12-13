package edu.polly.segundasemana;
public class App {
    public static void main(String[] args){
        String primeiroNome = "Pollyana";
        String segundoNome = "rocha";

        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
        
        int val1 = 7;
        int val2 = 7;
        int soma = somar(val1, val2);
        System.out.println(soma);
        // ctrl + k + c pra comentar varias linhas
        // ctrl + k + u pra descomentar
        
    }
    // o metodo so pode ter uma unica funcionalidade
    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return "Resul do metodo " + primeiroNome.concat(" ").concat(segundoNome);
    }
    public static int somar(int val1, int val2){
        return val1 + val2;
    }
}
