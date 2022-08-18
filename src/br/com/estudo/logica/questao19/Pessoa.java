package br.com.estudo.logica.questao19;

public class Pessoa {
    private String nome;
    private String telefone;

    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        String telefone  = this.telefone;

        if(telefone.length() > 10) {
            String resultado = "Número inválido";
            return resultado;
        }

        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
