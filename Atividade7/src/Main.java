import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro valor: ");
        int valor1 = scanner.nextInt();
        System.out.print("Informe o segundo valor: ");
        int valor2 = scanner.nextInt();
        System.out.print("Informe o terceiro valor: ");
        int valor3 = scanner.nextInt();

        // Encontrar os dois maiores valores
        int maiorValor = Math.max(valor1, Math.max(valor2, valor3));
        int menorValor = Math.min(valor1, Math.min(valor2, valor3));
        int segundoMaior = valor1 + valor2 + valor3 - maiorValor - menorValor;

        System.out.println("Maior número: " + maiorValor);
        System.out.println("Segundo maior número: " + segundoMaior);
        System.out.println("A soma dos dois maiores números é: " + (maiorValor + segundoMaior));

        scanner.close();
    }
}
