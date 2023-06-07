package Exercicio4;

import java.util.Scanner;

public class Idades {
    // TODO: 07/06/2023 Leia a idade de 20 pessoas e exiba a média das idades.
    public static void main(String[] args) {
        int idade;
        int idadesoma = 0;
        int totalPessoas = 20;
        double media;
        Scanner entrada = new Scanner(System.in);

        for (int i = 1; i <= totalPessoas; i++) {
            System.out.println("Digite a idade da pessoa " + i + ": ");
            idade = entrada.nextInt();
            if (idade > 0 && idade <= 120) {
                idadesoma += idade;
            } else {
                System.out.println("Idade inválida! Digite novamente");
                i--;
            }

        }

        media = (double) idadesoma / totalPessoas;
        System.out.println("A media das idades é de: " + media);
    }
}
