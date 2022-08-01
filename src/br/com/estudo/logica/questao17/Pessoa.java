package br.com.estudo.logica.questao17;

public class Pessoa {
    private String nome;
    private int idade;
    private Pessoa mae;
    private Pessoa pai;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void adicionaMae(Pessoa mae) {
        this.mae = mae;
    }

    public void adicionarPai(Pessoa pai) {
        this.pai = pai;
    }

    public Pessoa getMae() {
        return mae;
    }

    public Pessoa getPai() {
        return pai;
    }


    public void exibeArvoreGenealogica() {

        if( getMae() != null && getPai() != null) {
            System.out.println("Filho(a) -> nome: " + this.nome + ", idade: " + this.idade);
        }

        if(getMae() != null && getPai() != null){
            System.out.println("Pais: ");
            System.out.println("Mãe -> nome: " + this.mae.getNome() + ", idade: " + this.mae.getIdade());
            System.out.println("Pai -> nome: " + this.pai.getNome() + ", idade: " + this.pai.getIdade());
            System.out.println("-------------------------------------------");
        }

       if(getMae() != null && getPai() != null) {
           mae.exibeArvoreGenealogica();
           pai.exibeArvoreGenealogica();
       }

    }

}
