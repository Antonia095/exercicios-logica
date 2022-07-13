package br.com.estudo.logica.questao03;

import java.util.Random;
import java.util.Scanner;

public class PedraPapelTesoura {
    /*Implemente um jogo Jokenpo (Pedra, papel ou tesoura). Será o
     jogador contra a máquina. O código tem que gerar as posições
     aleatoriamente e comparar com o que escolhemos.*/

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("1 - Pedra \n2 - Papel \n3 - Tesoura");

        System.out.print("Digite um número de acordo com a opção desejada: ");
        int jogador = entrada.nextInt();

        Random gerador = new Random();
        int maquina = gerador.nextInt(3) + 1;

        if (jogador == 0 || jogador > 3 ) {
            System.out.print("\nOpção inválida! Informe um número entre 1 e 3: ");
            jogador = entrada.nextInt();
        }

        System.out.println("A opção da máquina foi: " + maquina);

        if (jogador == 1) {
            if (maquina == 1)  System.out.print("Empate!");
            if (maquina == 2)  System.out.print("Que pena, você perdeu!");
            if (maquina == 3)  System.out.print("Parabéns, você venceu!");

        } else if (jogador == 2) {
            if (maquina == 1)  System.out.print("Parabéns, você venceu!");
            if (maquina == 2)  System.out.print("Empate!");
            if (maquina == 3)  System.out.print("Que pena, você perdeu!");

        } else if (jogador == 3) {
            if (maquina == 1)  System.out.print("Que pena, você perdeu!");
            if (maquina == 2)  System.out.print("Parabéns, você venceu!");
            if (maquina == 3)  System.out.print("Empate!");
        }

    }
}
