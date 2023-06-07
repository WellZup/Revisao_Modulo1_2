package Exercicio8;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class Entrada_e_Reajuste_Salario {
    // TODO: 07/06/2023  Leia um conjunto de salários, sendo que para terminar a entrada será fornecido o valor -1.
    //  Após toda a entrada ter sido realizada, leia o valor de um reajuste.
    //  Em seguida exiba todos os salários já reajustados.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> salarios = new ArrayList<>();

        System.out.println("Digite os salários (digite -1 para encerrar):");

        double salario;
        do {
            salario = scanner.nextDouble();

            if (salario != -1) {
                salarios.add(salario);
            }
        } while (salario != -1);

        System.out.print("Digite o valor do reajuste: ");
        double reajuste = scanner.nextDouble();

        System.out.println("Salários reajustados:");
        for (double salarioAtual : salarios) {
            double salarioReajustado = salarioAtual + (salarioAtual * (reajuste / 100));
            System.out.println(salarioReajustado);
        }
    }
}
