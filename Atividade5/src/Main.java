import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Faça um programa que leia um valor informado pelo usuário e diga se o valor informado é positivo, negativo ou
         neutro. */
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int num = entrada.nextInt();

        if (num > 0) {
            System.out.println("O número escolhido é positivo!");
        } else if (num == 0) {
            System.out.println("O número escolhido é neutro");
        } else {
            System.out.println("O número escolhido é negativo");
        }
    }
}