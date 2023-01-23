package edu.polly.quintasemana;

public class carro {
    // atributos de carro:
    // cor, peneu, vidraca, parabrisa...
    String cor;
    String modelo;
    int capcidadeTanque;

    // igual o def init do py
    // construtor
    carro(){
        
    }
    carro(String cor, String modelo, int capcidadeTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capcidadeTanque = capcidadeTanque;
    }
    // destrutor:
    ///void finalize(){

    //}

    void setCor(String cor){
        this.cor = cor;
    }
    String getCor(){
        return cor;
    }

    void setModelo(String modelo){
        this.modelo = modelo;
    }
    String getModelo(){
        return modelo;
    }

    void setCapcidadeTanque(int capcidadeTanque){
        this.capcidadeTanque = capcidadeTanque;
    }
    int getcapcidadeTanque(){
        return capcidadeTanque;
    }
    double totalValorTanque(double valorCombustivel){
        return capcidadeTanque *valorCombustivel;
    }

    @Override
    public String toString(){
        return "Carro [ cor: "+cor+", modelo: "+modelo+", capacidade de tanque: "+capcidadeTanque+"]";
    }
    public static void main(String[] args) {
        carro mycarro= new carro("roxo", "ferrari", 20);
        System.out.println(mycarro);
        carro carro2 = new carro("rosa", "uso", 50);
        System.out.println(carro2);
    }
}
