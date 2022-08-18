package br.com.estudo.logica.questao18;

public class Guincho extends Automovel{

    public Guincho(int numRodas, int velMax) {
        super(numRodas, velMax);
    }

    public Guincho(){
        super();
    }

    public void guincharAutomovel(Automovel automovel) {
        if(!automovel.ligado) {
            System.out.println("Automomovel guinchado!");
        } else {
            System.out.println("Automovel não pode ser guinchado!");
        }
    }

}
