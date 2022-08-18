package br.com.estudo.logica.questao18;

public class CarroAutomatico extends Carro{

    public CarroAutomatico(int numRodas, int velMax, boolean freio) {
        super(numRodas, velMax, freio);

    }

    public void statusCarro(){
        if (super.freio) {
            super.ligar();
            System.out.println("Carro ligado!");
        } else {
            super.desligar();
            System.out.println("Carro desligado!");
        }
    }

}
