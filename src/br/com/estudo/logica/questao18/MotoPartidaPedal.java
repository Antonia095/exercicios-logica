package br.com.estudo.logica.questao18;

public class MotoPartidaPedal extends Moto{

    public MotoPartidaPedal(int numRodas, int velMax, boolean acelarador) {
        super(numRodas, velMax, acelarador);
    }

    public void statusMoto(){
        if (super.acelarador) {
            super.ligar();
            System.out.println("Moto ligada!");
        } else {
            super.desligar();
            System.out.println("Moto desligada!");
        }
    }
}
