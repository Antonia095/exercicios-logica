package br.com.estudo.logica.questao06;

import java.util.Random;

public class MaiorMenorNumero {
    /* Gere 10 números aleatórios entre 0 e 100; mostre todos na tela
     (em uma única linha); identifique o menor e o maior deles.*/

    public static void main(String[] args) {
        Random gerador = new Random();
        int maiorNum = 0;
        int menorNum = 0;

        for(int i = 0; i < 10; i++) {
            int numGerado = gerador.nextInt(100);
            System.out.print(numGerado + " - " );

            if(i == 0){
                maiorNum = numGerado;
                menorNum = numGerado;
            } else if(numGerado > maiorNum) {
                maiorNum = numGerado;
            } else if(numGerado < menorNum) {
                menorNum = numGerado;
            }
        }

        System.out.println("\nMaior número: " +maiorNum);
        System.out.println("Menor número: " +menorNum);
    }
}
