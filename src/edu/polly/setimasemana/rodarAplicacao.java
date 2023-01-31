package edu.polly.setimasemana;

public class rodarAplicacao {
    public static void main(String[] args) {
// Cria um array chamado classes que guarda três objetos do 
//tipo ClasseMae (uma instância de ClasseFilha1, 
//outra de ClasseFilha2 e outra de ClasseMae).
        ClasseMae[] classes = new ClasseMae[]{new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};

        for (ClasseMae classe: classes){
            classe.metodo1();
        }

        System.out.println(" ");

        for (ClasseMae classe : classes) {
            classe.metodo2();
        }

        System.out.println(" ");

        //sobreescrita pura
        ClasseFilha2 classeFilha2 = new ClasseFilha2();
        classeFilha2.metodo2();
    }
}
