package Exercicio5;

import java.util.Scanner;

public class Entre_0_100 {
    // TODO: 07/06/2023 Faça um algoritmo que leia 20 números e,
    //  ao final, escreva quantos estão entre 0 e 100.
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int totalNumeros = 20;
        int contador = 0;
        int numero;

        System.out.println("Faremos um algoritimo que lê, quantos números estarão entre os que digitar.");

        for (int i = 1; i < totalNumeros; i++) {
            boolean numeroValido = false;
            while (!numeroValido) {
                System.out.println("Digite o número " + i + ": ");
                numero = entrada.nextInt();

                numeroValido = numero >= 0 && numero <= 100;

                if (!numeroValido) {
                    System.out.println("Número inválido! Digite novamente.");
                } else {
                    contador++;
                }
            }
        }
        System.out.println("Números que estão entre 0 e 100: " + contador);
    }
}
