package br.com.estudo.logica.questao02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Teste {

    /* Para cada produto informado (nome, preço e quantidade), escreva o
        nome do produto comprado e o valor total a ser pago, considerando
        que são oferecidos descontos pelo número de unidades compradas,
        segundo a tabela abaixo:
        a. Até 10 unidades: valor total
        b. De 11 a 20 unidades: 10% de desconto
        c. De 21 a 50 unidades: 20% de desconto
        d. Acima de 50 unidades: 25% de desconto*/

    public static void main(String [] args) {
        Produto produto1 = new Produto("Arroz", 3.45);
        Produto produto2 = new Produto("Feijão", 6.70);
        Produto produto3 = new Produto("Café", 4.80);

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o nome do produto: ");
        String nomeProduto = entrada.next();

        System.out.print("Informe a quantidade: ");
        int quantidadeProduto = entrada.nextInt();

        DecimalFormat df = new DecimalFormat("0.00");

        if (nomeProduto.equals(produto1.getNome())) {
            double valorTotal = produto1.desconto(quantidadeProduto);
            System.out.println("O valor total a ser pago é: R$" + df.format(valorTotal));
        } else if (nomeProduto.equals(produto2.getNome())) {
            double valorTotal = produto2.desconto(quantidadeProduto);
            System.out.println("O valor total a ser pago é: R$" + df.format(valorTotal));
        } else if (nomeProduto.equals(produto3.getNome())) {
            double valorTotal = produto3.desconto(quantidadeProduto);
            System.out.println("O valor total a ser pago é: R$" + df.format(valorTotal));
        } else {
            System.out.println("Sem produto em estoque");
        }

    }
}
