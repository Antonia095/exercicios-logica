package br.com.estudo.logica.questao19;

public class QuestaoAgendaTelefonica {
    /*Implemente um sistema de agenda telefônica. Faça (ao menos)
      as interações de adicionar e deletar números.*/
    public static void main(String[] args) {

        var contato1 = new Pessoa("Ana", "856464456");
        var contato2 = new Pessoa("Pedro", "132454564");
        var contato3 = new Pessoa("Maria", "31345465464");
        var contato4 = new Pessoa("João", "646546463");

        var agendaTelefonica = new AgendaTelefonica();

        agendaTelefonica.adicionarNumeroTelefonico(contato1);
        agendaTelefonica.adicionarNumeroTelefonico(contato2);
        agendaTelefonica.adicionarNumeroTelefonico(contato3);
        agendaTelefonica.adicionarNumeroTelefonico(contato4);

        agendaTelefonica.imprimirListaTelefonica();

        System.out.println("--------------Imprimindo lista depois de remover contato--------------");
        agendaTelefonica.removerNumeroTelefonico(contato1);
        agendaTelefonica.imprimirListaTelefonica();

        agendaTelefonica.alterarNumeroTelefonico("Pedro", "32465465836");

        System.out.println("-----------Imprimir lista depois que alterar número-----------------");

        agendaTelefonica.alterarNumeroTelefonico("Pedro", "324654656");

    }
}
