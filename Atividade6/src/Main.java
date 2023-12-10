import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* 6 - Qual o maior? Faça um programa para ler 3 valores (considere que não serão informados valores iguais) e
        escrever o maior deles. */

        Scanner entradaValor1 = new Scanner(System.in);
        Scanner entradaValor2 = new Scanner(System.in);
        Scanner entradaValor3 = new Scanner(System.in);

        System.out.println("Informe o primeiro valor");
        int num1 = entradaValor1.nextInt();
        System.out.println("Informe o segundo valor");
        int num2 = entradaValor2.nextInt();
        System.out.println("Informe o terceiro valor");
        int num3 = entradaValor3.nextInt();

        int maior = Math.max(num1, Math.max(num2, num3));

        System.out.println("O maior número é " + maior);
    }
}