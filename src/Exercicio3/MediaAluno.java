package Exercicio3;

import java.util.Scanner;

public class MediaAluno {
    // TODO: 07/06/2023 Escreva um algoritmo que leia o número de identificação,*
    //  as 3 notas obtidas por um aluno nas 3 verificações *
    //  e a média dos exercícios que fazem parte da avaliação,*
    //  e calcule a média de aproveitamento,
    //  usando a fórmula: MA := (nota1 + nota 2 * 2 + nota 3 * 3 + ME)/7
    //  A atribuição dos conceitos obedece a tabela abaixo.
    //  O algoritmo deve escrever o número do aluno, suas notas, a média dos exercícios, a média de aproveitamento,
    //  o conceito correspondente e a mensagem 'Aprovado' se o conceito for A, B ou C, e 'Reprovado' se o conceito for D ou E.

    // Média de aproveitamento Conceito
    //>= 90 A
    //>= 75 e < 90 B
    //>= 60 e < 75 C
    //>= 40 e < 60 D
    //< 40 E

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Olá, querido aluno.\nPara saber sua média, siga os comandos a seguir.\nDigite sua identificação:");
        int identificacao = entrada.nextInt();

        double[] notas = new double[3];

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Digite a nota da verificação %d: ", i + 1);
            notas[i] = entrada.nextDouble();
        }

        System.out.print("Digite a média dos exercícios: ");
        double mediaExercicios = entrada.nextDouble();

        double mediaAproveitamento = calcularMediaAproveitamento(notas, mediaExercicios);
        String conceito = atribuirConceito(mediaAproveitamento);

        System.out.printf("Número de identificação do aluno: %d%n", identificacao);
        System.out.printf("Notas: %.2f, %.2f, %.2f%n", notas[0], notas[1], notas[2]);
        System.out.printf("Média dos exercícios: %.2f%n", mediaExercicios);
        System.out.printf("Média de aproveitamento: %.2f%n", mediaAproveitamento);
        System.out.printf("Conceito: %s%n", conceito);

        if (conceito.equals("A") || conceito.equals("B") || conceito.equals("C")) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }

    private static double calcularMediaAproveitamento(double[] notas, double mediaExercicios) {
        double somaPesos = 0;
        double somaNotas = 0;

        for (int i = 0; i < notas.length; i++) {
            double peso = i + 1;
            somaPesos += peso;
            somaNotas += notas[i] * peso;
        }

        return (somaNotas + mediaExercicios) / (somaPesos + 1);
    }

    private static String atribuirConceito(double mediaAproveitamento) {
        if (mediaAproveitamento >= 90) {
            return "A";
        } else if (mediaAproveitamento >= 75) {
            return "B";
        } else if (mediaAproveitamento >= 60) {
            return "C";
        } else if (mediaAproveitamento >= 40) {
            return "D";
        } else {
            return "E";
        }
    }
}




