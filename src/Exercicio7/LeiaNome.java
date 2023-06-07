package Exercicio7;
import java.util.Scanner;
public class LeiaNome {
    // TODO: 07/06/2023 Leia o nome do usuário e um núm
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite o número de vezes que deseja escrever o nome: ");
        int N = entrada.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println(nome);
        }
    }
}
