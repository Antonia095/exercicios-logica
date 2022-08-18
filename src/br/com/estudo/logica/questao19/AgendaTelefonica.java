package br.com.estudo.logica.questao19;

import java.util.ArrayList;
import java.util.List;

public class AgendaTelefonica {
    private List<Contato> contatos;

    public AgendaTelefonica() {
        this.contatos = new ArrayList<>();
    }

    public void adicionarNumeroTelefonico(Contato contato) {
        if (contato.getTelefone() == "Número inválido") {
            System.out.println("Insira um número válido");
        } else {
            this.contatos.add(contato);
        }
    }

    public void removerNumeroTelefonico(Contato contato) {
        this.contatos.remove(contato);
    }

    public void alterarNumeroTelefonico(String nome, String telefone) {
        if(telefone.length() > 10 ) {
            System.out.println("O número do contado: " + nome + ", não pode ser alterado. Insira um número válido!");
        } else {
             contatos.forEach(contato -> {
                if (contato.getNome().equals(nome)) {
                    contato.setTelefone(telefone);
                }
            });
            imprimirListaTelefonica();
        }
    }

    public void imprimirListaTelefonica() {
        contatos.forEach(contato -> {
            System.out.println("Contato: " + contato.getNome() + ", telefone: " + contato.getTelefone());
        });
    }
}
