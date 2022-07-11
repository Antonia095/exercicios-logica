package br.com.estudo.logica.questao02;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }


    public double desconto(int quantidade) {
        if(quantidade <= 10) {

            return preco *= quantidade;

        } else if (quantidade <= 20) {

            double valorDesconto = preco * 0.10;
            return quantidade * (preco - valorDesconto);

        } else if (quantidade <= 50) {

            double valorDesconto = preco * 0.20;
            return quantidade * (preco - valorDesconto);


        } else {

            double valorDesconto = preco * 0.25;
            return quantidade * (preco - valorDesconto);
        }
    }

    @Override
    public String toString() {
        return "Produtos -> " +
                "nome: " + nome +
                ", preco: " + preco;
    }
}
