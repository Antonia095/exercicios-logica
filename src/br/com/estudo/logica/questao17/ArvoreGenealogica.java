package br.com.estudo.logica.questao17;

public class ArvoreGenealogica {
    /* Faça um programa para representar a árvore genealógica de
    uma família. Para tal crie uma classe Pessoa que permita indicar
    além de nome e idade, o pai e a mãe. Tenha em mente que pai e
    mãe também são do tipo Pessoa.*/

    public static void main(String[] args) {
      // Adicionando familia paterna
      var avoPaiPaterno = new Pessoa("José", 89);
      var avoMaePaterno = new Pessoa("Ana", 75);

      var pai = new Pessoa("Joaguim", 49);

      pai.adicionarPai(avoPaiPaterno);
      pai.adicionaMae(avoMaePaterno);

      // Adicionando familia materna
      var avoPaiMaterno = new Pessoa("Paulo", 79);
      var avoMaeMaterno = new Pessoa("Maria", 64);

      var mae = new Pessoa("Laura", 38);

      mae.adicionaMae(avoMaeMaterno);
      mae.adicionarPai(avoPaiMaterno);

      // Adicionando filho
      var filho = new Pessoa("João", 12);

      filho.adicionaMae(mae);
      filho.adicionarPai(pai);

      filho.exibeArvoreGenealogica();
    }
}
