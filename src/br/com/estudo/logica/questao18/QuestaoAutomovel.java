package br.com.estudo.logica.questao18;

public class QuestaoAutomovel {
    /*Faça uma classe Automóvel, identificando seus atributos e
    métodos. Herdando tais características, crie três classes: Carro,
    Moto e Guincho. Herdando Carro, faça uma classe
    CarroAutomático, na qual, para poder ligar, o freio precisa estar
    sendo pressionado. Herdando Moto, faça uma classe
    MotoPartidaPedal, onde, para ligar, o acelerador precisa estar
    puxado. O guincho pode carregar tanto carro quanto moto. Utilize
    os 4 pilares da POO.*/
    public static void main(String[] args) {
        var carroAutomatico = new CarroAutomatico(4,180, true );
        var motoPartidaPedal = new MotoPartidaPedal(2,200,false);

        var guincho = new Guincho();

        guincho.guincharAutomovel(carroAutomatico);
        guincho.guincharAutomovel(motoPartidaPedal);

        carroAutomatico.statusCarro();
        guincho.guincharAutomovel(carroAutomatico);

        motoPartidaPedal.statusMoto();
        guincho.guincharAutomovel(motoPartidaPedal);

    }
}
