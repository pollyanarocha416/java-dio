package edu.polly.sextasemana;

public class Veiculo {

    int rodas;
    int portas;
    int rodasReservas;

    Veiculo(int rodas, int portas, int rodasReservas){
        this.rodas = rodas;
        this.portas = portas;
        this.rodasReservas = rodasReservas;
    }

    void setRodas(int rodas) {
        this.rodas = rodas;
    }

    int getRodas() {
        return rodas;
    }

    void setPortas(int portas) {
        this.portas = portas;
    }

    int getPortas() {
        return portas;
    }

    void setRodasReservas(int rodasReservas) {
        this.rodasReservas = rodasReservas;
    }

    int getRodasReservas() {
        return rodasReservas;
    }
}
