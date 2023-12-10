import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /* Faça um programa para ler 2 valores informados pelo usuário e se o segundo valor informado for neutro, deve
        ser lido um novo valor - ou seja, para o segundo valor não pode ser aceito o valor zero nem um valor negativo.
        O programa deve imprimir o resultado da divisão do primeiro valor lido pelo segundo valor lido. */

        Scanner scanner = new Scanner(System.in);

        int teste;
        int val2;

        System.out.print("Informe o primeiro valor: ");
        int val1 = scanner.nextInt();

        do {
            System.out.print("Informe o segundo valor: ");
            val2 = scanner.nextInt();

        } while (val2 <= 0);

        System.out.println("O resultado a divisão do primeiro pelo segundo número é " + val1/val2);

    }
}