import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /* Faça um programa que leia 10 valores informados pelo usuário, calcule, exiba os números informados e escreva
        a média aritmética desses valores lidos. */

        Scanner scanner = new Scanner(System.in);

        int[] valores = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Informe o valor " + (i + 1) + ": ");
            valores[i] = scanner.nextInt();
        }

        int somaValores = Arrays.stream(valores).sum();
        double media = (double) somaValores / 10;

        System.out.println("A soma dos números é " + somaValores);
        System.out.println("E a média aritmética é " + media);

    }
}