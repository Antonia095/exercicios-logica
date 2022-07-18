package br.com.estudo.logica.questao13;

import java.text.DecimalFormat;

public class Teste {
     /*Faça um método que calcule a média de um aluno de acordo
        com o critério definido neste curso. Além disso, faça um outro
        método que informe o status do aluno de acordo com a tabela a
        seguir:
        - Nota acima de 6: “Aprovado”
        - Nota entre 4 e 6: “Verificação Suplementar”
        - Nota abaixo de 4: “Reprovado”*/

    public static void main(String[] args) {

        var aluno = new Aluno("Ana", 9.4,6, 8.5);

        var verificaNota = new VerificaNota();

        var nota1 = aluno.getNota1();
        var nota2 = aluno.getNota2();
        var nota3 = aluno.getNota3();

        var media = verificaNota.media(nota1,nota2,nota3);

        DecimalFormat df = new DecimalFormat("0.0");

        System.out.println("A média do aluno é : " + df.format(media));

        verificaNota.statusAluno(media);

    }
}
