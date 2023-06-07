package Exercicio2;

import java.util.Scanner;

// TODO: 07/06/2023 Faça um algoritmo que leia uma variável
//  e some 5 caso seja par ou some 8 caso seja ímpar,
//  imprimir o resultado desta operação.

public class Somar_5_ou_8 {
    public static final String ANSI_YELLOW = "\u001B[33m", ANSI_GREEN = "\u001B[32m";

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("------Somar com 05 ou 08?------\nVeremos isso dependendo de sua escolha.");

        int numero;

        System.out.println(ANSI_GREEN + "Digite um número: ");
        numero = entrada.nextInt();
        int resultado = 0;
        if (numero % 2 == 0) {
            resultado += 5;
        } else {
            resultado += 8;
        }

        System.out.println(ANSI_YELLOW + "Seu resultado: " + (resultado + numero));

    }
}
