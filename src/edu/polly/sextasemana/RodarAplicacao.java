package edu.polly.sextasemana;

public class RodarAplicacao {
    public static void main(String[] args) {
        Funcionario funcionario=new Funcionario();
        // up cast:
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //downcast: nao e indicado usar pq da erro
        //Vendedor vendedor_ = (vendedor) new Funcionario();
    }
}
