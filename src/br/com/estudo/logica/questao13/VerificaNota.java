package br.com.estudo.logica.questao13;

public class VerificaNota {

        public double media(double nota1, double nota2, double nota3){
            double somaNota = nota1 + nota2 + nota3;
            double media = somaNota/3;

            return media;
        }

        public void statusAluno(double media) {
            if(media > 6){
                System.out.println("Aprovado");
            } else if (media < 4) {
                System.out.println("Reprovado");
            } else {
                System.out.println("Verificação Suplementar");
            }
        }

}
