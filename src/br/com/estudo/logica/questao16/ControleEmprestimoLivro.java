package br.com.estudo.logica.questao16;

import java.time.LocalDate;

public class ControleEmprestimoLivro {
    /*Faça um programa para controle de empréstimo de livros, com
      as classes Emprestimo, Livro e Pessoa.*/

    public static void main(String[] args) {
        var pessoa = new Pessoa("João", "989878897", "839865466");
        var livro = new Livro("Drácula", "Bram Stoker", "9788595201569");

        var emprestimo = new Emprestimo(
                LocalDate.of(2022,07,20),
                LocalDate.now(),
                7,
                pessoa,
                livro);

        emprestimo.verificaPrazoDevolucao();
    }
}
