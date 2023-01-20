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

}
