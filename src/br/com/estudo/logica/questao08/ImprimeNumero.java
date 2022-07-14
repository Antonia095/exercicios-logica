package br.com.estudo.logica.questao08;

import java.util.Scanner;

public class ImprimeNumero {
    /*Leia um número até que o usuário digite 10;*/

    public static void main(String[] args) {
        int numero;

        Scanner numEntrada = new Scanner(System.in);
        do{
            System.out.print("Informe um número: ");
            numero = numEntrada.nextInt();

        }while (numero != 10);
    }
}
