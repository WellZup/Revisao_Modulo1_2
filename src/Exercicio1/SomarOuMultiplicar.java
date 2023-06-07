package Exercicio1;

import java.util.Scanner;

public class SomarOuMultiplicar {
    // TODO: 07/06/2023 Faça um algoritmo que leia dois valores inteiros A e B
    //  se os valores forem iguais deverá se somar os dois,
    //  caso contrário multiplique A por B.
    //  Ao final de qualquer um dos cálculos deve-se atribuir
    //  o resultado para uma variável C e mostrar seu conteúdo na tela.

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Somar ou Multiplicar? " +
                "Eis a questão. \nFaremos o seguinte, " +
                "digite dois números e lhe mostrarei o que vai será.");

        int A, B, C, soma, multiplicacao ;

        System.out.println("Digite o primeiro número: ");
        A = entrada.nextInt();
        System.out.println("Digite o segundo número: ");
        B = entrada.nextInt();

        if (A == B) {
            soma = A + B;
            C = soma;

        } else {
            multiplicacao = A * B;
            C = multiplicacao;
        }

        System.out.println("O resultado é: " + C);

    }

}
