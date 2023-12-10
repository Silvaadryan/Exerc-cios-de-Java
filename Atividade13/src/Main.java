// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro número inteiro: ");
        int primeiroNumero = scanner.nextInt();

        System.out.print("Informe o segundo número inteiro (maior que o primeiro): ");
        int segundoNumero = scanner.nextInt();

        double media = (double) (primeiroNumero + segundoNumero) / 2;

        System.out.println("A média aritmética é: " + media);

        System.out.println("Números inteiros entre " + primeiroNumero + " e " + segundoNumero + ":");
        for (int i = primeiroNumero + 1; i < segundoNumero; i++) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}
