package br.com.estudo.logica.questao15;

import java.util.Scanner;

import static br.com.estudo.logica.questao15.Calculadora.divisao;
import static br.com.estudo.logica.questao15.Calculadora.multiplicacao;
import static br.com.estudo.logica.questao15.Calculadora.soma;
import static br.com.estudo.logica.questao15.Calculadora.subtracao;

public class TesteCalculadora {
    /*Crie uma classe Calculadora que faça as operações de soma,
        subtração, multiplicação, divisão e potenciação. Cada operação
        deve ser um método e todos os métodos devem ser estáticos.
        Para fazer a escolha das operações use como base o exercício 4 */

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
                System.out.println("O resultado da soma dos números é " + soma(primeiroNum, segundoNum));
                break;
            }
            case 2: {
                System.out.println("O resultado da subtração dos números é " + subtracao(primeiroNum, segundoNum));
                break;
            }
            case 3: {
                System.out.println("O resultado da multiplicação dos números é " + multiplicacao(primeiroNum, segundoNum));
                break;
            }
            case 4: {
                if(primeiroNum < segundoNum) {
                    System.out.println("O valor desta divisão é 0");
                } else {
                    System.out.println("O resultado da divisão dos números é " + divisao(primeiroNum, segundoNum));
                }
                break;
            } default:
                System.out.println("A opção escolhida é inválida! Informe um número entre 1 e 4");
        }

    }
}
