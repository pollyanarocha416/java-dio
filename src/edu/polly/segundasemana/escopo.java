package edu.polly.segundasemana;

public class escopo {
    // escopo de classe, metodo e fluxo:
    // caso vc declare uma variavel dentro de um metodo,
    // o escopo dessa variavel esta limitado apenas ao corpo desse 
    // metodo, ou seja, dentro das chaves que limitam o metodo, exemplo:
    public String textos(String texto){
        String meuNome = "Polly";
        return meuNome;
    }
    // meuNome so e acessado pelo metodo

    // variavel de fluxo e tipo o x dentro de For e as variaveis 
    // q estao recuadas neles


}
