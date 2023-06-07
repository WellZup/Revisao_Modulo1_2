package Exercicio6;
import java.util.Scanner;

public class Somar_Menos_NumeroNegativo {
    // TODO: 07/06/2023 Escreva um algoritmo que leia uma sequência de números do usuário e realize a soma desses números.
    //  Encerre a execução quando um número negativo for digitado.
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;
        int soma = 0;

        System.out.println("  Digite uma sequência de números\n (Para sair, digite um número negativo para encerrar):");

        do {
            System.out.println("Digite um número: ");
            numero = entrada.nextInt();

            if (numero >= 0) {
                soma += numero;
            }
        } while (numero >= 0);

        System.out.println("A soma dos números é: " + soma);
    }
}

