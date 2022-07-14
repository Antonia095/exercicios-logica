package br.com.estudo.logica.questao07;

import java.util.Scanner;

public class Fibonacci {
    /*Calcule a série de Fibonacci para um número inteiro não negativo
        informado pelo usuário. A série de Fibonacci inicia com os
        números F0 = 0 e F1 = 1, e cada número posterior equivale à soma
        dos dois números anteriores (Fn = Fn-1 + Fn-2). Por exemplo, caso
        o usuário informe o número 9, o resultado seria 0, 1, 1, 2, 3, 5,
        8, 13, 21, 34.*/

    public static void main(String[] args) {
            Scanner numEntrada = new Scanner(System.in);

            System.out.print("Informe um número maior que 0: ");
            int numero =  numEntrada.nextInt();

            if (numero < 0) System.out.println("Número inválido!");

            int numAtual = 0;
            int numAnterior = 1;

            System.out.println("\nA série de Fibonacci para o número " + numero + " é:");
            for ( int i = 0; i < numero; i++ ) {
                System.out.print(numAtual + ", ");
                numAnterior = numAnterior + numAtual;
                numAtual = numAnterior - numAtual;

            }
    }
}
