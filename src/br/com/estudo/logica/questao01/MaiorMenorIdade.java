package br.com.estudo.logica.questao01;

import java.util.Scanner;

public class MaiorMenorIdade {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe sua idade: ");
        int idade = entrada.nextInt();

        if(idade >= 18){
            System.out.println("É maior de idade!");
        }

        System.out.println("É menor de idade!");
    }
}
