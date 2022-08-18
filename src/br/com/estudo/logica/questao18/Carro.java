package br.com.estudo.logica.questao18;

public class Carro extends Automovel{
    protected boolean freio;

    public Carro(int numRodas, int velMax, boolean freio) {
        super(numRodas, velMax);
        this.freio = freio;
    }

}
