package br.com.estudo.logica.questao09;

import java.util.Scanner;

public class SerieFibonacci {
    /*Altere o exercício 7 para o algoritmo contar a série Fibonacci até
     um determinado número. Por exemplo, caso declarado o número
     25, o resultado seria: 0, 1, 1, 2, 3, 5, 8, 13, 21*/
    public static void main(String[] args) {
        Scanner numEntrada = new Scanner(System.in);

        System.out.print("Informe um número maior que 0: ");
        int numero =  numEntrada.nextInt();

        if (numero < 0) System.out.println("Número inválido!");

        int numAtual = 0;
        int numAnterior = 1;

        System.out.println("\nA série de Fibonacci o número " + numero + " é:");

        do{
            System.out.print(numAtual + ", ");
            numAnterior = numAnterior + numAtual;
            numAtual = numAnterior - numAtual;

        }while (numAtual < numero);
    }
}
