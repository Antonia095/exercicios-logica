package br.com.estudo.logica.questao16;

import java.time.LocalDate;
import java.time.Period;

public class Emprestimo {
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    private int totalDiasEmprestimo;
    private Pessoa pessoa;
    private Livro livro;

    public Emprestimo (LocalDate dataEmprestimo, LocalDate dataDevolucao, int totalDiasEmprestimo, Pessoa pessoa, Livro livro) {
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.totalDiasEmprestimo = totalDiasEmprestimo;
        this.pessoa = pessoa;
        this.livro = livro;
    }

    private int calculaPrazoDevolucao(){
        Period periodo = Period.between(this.dataEmprestimo, this.dataDevolucao);
        int dias = Math.abs(periodo.getDays());

        return dias;
    }

    public void verificaPrazoDevolucao() {
        if (calculaPrazoDevolucao() <= totalDiasEmprestimo) {
            System.out.println("Livro entregue dentro do prazo.");
        } else {
            System.out.println("Livro entregue com atraso.");
        }
    }

}
