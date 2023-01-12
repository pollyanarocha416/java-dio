package edu.polly.quartasemana;

// tudo q e execultado vai ser nos metodos


// metodo principal
public class conceitometodo {
    public static void main(String[] args) {
        conceitometodo.fazer(5);
        conceitometodo.somar(5, 6);
        conceitometodo.subtrair(5, 6);
        conceitometodo.multiplicar(5, 6);
        conceitometodo.dividir(5, 6);
    }
        // metodo publico do tipo string 
   
    public static void fazer(int i){
        i = i + 10;
        System.out.println("val de i: " + i);
    }
    public static int somar(int a, int b){
        return a + b;
    }
    
    public static int subtrair(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static int dividir(int a, int b) {
        return a / b;
    }

    public static void manhan(String saldacao){
        saldacao = "bom dia";
        System.out.println(saldacao);
    }

    // exemplo do professor:
    public static void obterMensagem(int hora) {

        switch (hora) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                mensagemBomDia();
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                mensagemBoaTarde();
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                mensagemBoaNoite();
                break;
            default:
                System.out.println("Hora inválida.");
                break;
        }
    }

    public static void mensagemBomDia() {
        System.out.println("Bom dia!");
    }

    public static void mensagemBoaTarde() {
        System.out.println("Bom tarde!");
    }

    public static void mensagemBoaNoite() {
        System.out.println("Bom noite!");
    }
    
}