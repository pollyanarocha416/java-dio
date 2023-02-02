package pratica;
public class calculadora {
    
    void somar(double x, double y){
        System.out.println("Soma de " + x + " e "+ y + " é igual a: " + (x + y));
    }

    void subtrair(double x, double y) {
        System.out.println("Subtracao de " + x + " e " + y + " é igual a:" + (x - y));
    }

    void multiplicar(double x, double y) {
        System.out.println("Mutiplicacao de " + x + " e " + y + "é igual a:" + (x * y));
    }

    void dividir(double x, double y) {
        System.out.println("Divisao de " + x + " e " + y + " é igual a: " + (x / y));
    }
    public static void main(String[] args) {
        calculadora calcular = new calculadora();
        calcular.somar(4, 6);
        calcular.subtrair(4, 6);
        calcular.multiplicar(4, 6);
        calcular.dividir(4, 6);
    } 
}
