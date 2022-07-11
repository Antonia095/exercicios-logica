package br.com.estudo.logica.questao05;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner numEntrada = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int numero =  numEntrada.nextInt();

        for (int i = 1; i <= 10; i++){
            int resultado = numero * i;

            System.out.println(numero + " X " + i + " = " + resultado);
        }
    }
}
