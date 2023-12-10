import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /* Escreva um programa para ler as notas das 4 avaliações de um aluno no semestre, calcular e escrever a média
        do semestre e a seguinte mensagem: PARABÉNS! Você foi aprovado! somente se o aluno foi aprovado (considere 6.0
        a média mínima para aprovação e 4 notas informadas).  */

        Scanner scanner = new Scanner(System.in);
        int[] notas = new int[4];

        for (int i = 0; i < 4; i++) {

            System.out.print("Informe o " + (i + 1) + " número: ");
            notas[i] = scanner.nextInt();

        }

        double media = (double) Arrays.stream(notas).sum() / 4;

        System.out.println("Sua média é " + media);

        if (media > 5.9) {
            System.out.println("PARABÉNS! Você foi aprovado!");
        } else {
            System.out.println("Você foi reprovado");
        }

    }
}