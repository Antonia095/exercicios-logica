package br.com.estudo.logica.questao14;

import java.util.Scanner;

public class CalculaTempoSegundo {
    /*Leia do usuário o tempo em segundos e escreva em horas,
        minutos e segundos. Utilize cinco métodos, para a leitura e escrita
        de dados e para obtenção de horas, minutos e segundos a partir
        do tempo em segundos.
        Ex: 7023 segundos equivalem a 1h57min3seg.*/
    public static void main(String[] args) {

        var tempo = lerTempoEmSegundo();

        var horas = horas(tempo);
        var minutos = minutos(tempo);
        var segundos = segundos(tempo);

        imprimeHora(horas, minutos, segundos);

    }

    public static int lerTempoEmSegundo() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o tempo em segundo: ");
        int tempo = entrada.nextInt();
        return tempo;
    }

    public static int horas(int tempo) {
        var hora = tempo / 3600;
        return hora;
    }

    public static int minutos(int tempo) {
        var minuto = (tempo - (horas(tempo) * 3600)) / 60;
        return minuto;
    }

    public static int segundos(int tempo) {
        var segundo = (tempo - (horas(tempo) * 3600)) - (minutos(tempo) * 60);
        return segundo;
    }

    public static void imprimeHora(int horas, int minutos, int segundos) {
        System.out.println("O total em horas é: " + horas + "h" + minutos + "min" + segundos + "seg");
    }

}
