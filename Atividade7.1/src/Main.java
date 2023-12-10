import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] valores = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Informe o valor " + (i + 1) + ": ");
            valores[i] = scanner.nextInt();
        }

        int maiorValor = Integer.MIN_VALUE;
        int segundoMaior = Integer.MIN_VALUE;

        for (int valor : valores) {
            if (valor > maiorValor) {
                segundoMaior = maiorValor;
                maiorValor = valor;
            } else if (valor > segundoMaior && valor != maiorValor) {
                segundoMaior = valor;
            }
        }

        int soma = maiorValor + segundoMaior;

        System.out.println("Maior número: " + maiorValor);
        System.out.println("Segundo maior número: " + segundoMaior);
        System.out.println("A soma dos dois maiores números é: " + soma);
    }
}
