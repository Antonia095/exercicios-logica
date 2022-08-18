package br.com.estudo.logica.questao19;

import java.util.ArrayList;
import java.util.List;

public class AgendaTelefonica {
    private List<Pessoa> pessoas;

    public AgendaTelefonica() {
        this.pessoas = new ArrayList<>();
    }

    public void adicionarNumeroTelefonico(Pessoa pessoa) {
        if (pessoa.getTelefone() == "Número inválido") {
            System.out.println("Insira um número válido");
        } else {
            this.pessoas.add(pessoa);
        }
    }

    public void removerNumeroTelefonico(Pessoa pessoa) {
        this.pessoas.remove(pessoa);
    }

    public void alterarNumeroTelefonico(String nome, String telefone) {
        if(telefone.length() > 10 ) {
            System.out.println("O número do contado: " + nome + ", não pode ser alterado. Insira um número válido!");
        } else {
             pessoas.forEach(pessoa -> {
                if (pessoa.getNome().equals(nome)) {
                    pessoa.setTelefone(telefone);
                }
            });
            imprimirListaTelefonica();
        }
    }

    public void imprimirListaTelefonica() {
        pessoas.forEach(pessoa -> {
            System.out.println("Contato: " + pessoa.getNome() + ", telefone: " + pessoa.getTelefone());
        });
    }
}
