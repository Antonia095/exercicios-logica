package br.com.estudo.logica.questao18;

public class Moto extends Automovel{
    protected boolean acelarador;

    public Moto(int numRodas, int velMax, boolean acelarador) {
        super(numRodas, velMax);
        this.acelarador = acelarador;
    }

}
