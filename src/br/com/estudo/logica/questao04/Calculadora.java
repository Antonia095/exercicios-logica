package br.com.estudo.logica.questao04;

import java.util.Scanner;

public class Calculadora {
    /*Implemente o programa da calculadora utilizando uma instrução
      switch-case para determinar a operação que deve ser executada,
      conforme o usuário escolheu no menu de opções*/

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o primeiro número:");
        int primeiroNum = entrada.nextInt();

        System.out.print("Informe o segundo número:");
        int segundoNum = entrada.nextInt();

        System.out.println("1 - Somar \n2 - Subtrair \n3 - Muiltiplicar \n4 - Dividir");

        System.out.print("Digite um número de acordo com a opção desejada: ");
        int opcao = entrada.nextInt();


        switch (opcao) {
                case 1: {
                    int somar = primeiroNum + segundoNum;
                    System.out.println("O resultado da soma dos números é " + somar);
                    break;
                }
                case 2: {
                    int subtrair = primeiroNum - segundoNum;
                    System.out.println("O resultado da subtração dos números é " + subtrair);
                    break;
                }
                case 3: {
                    int multiplicar = primeiroNum * segundoNum;
                    System.out.println("O resultado da multiplicação dos números é " + multiplicar);
                    break;
                }
                case 4: {
                    if(primeiroNum < segundoNum) {
                        System.out.println("O valor desta divisão é 0");
                    } else {
                        int dividir = primeiroNum / segundoNum;
                        System.out.println("O resultado da divisão dos números é " + dividir);
                    }
                    break;
                } default:
                    System.out.println("A opção escolhida é inválida! Informe um número entre 1 e 4");
        }


    }
}
