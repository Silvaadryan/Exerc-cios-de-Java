import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Escreva um programa em Java em que o usuário informe o seu nome e exiba a mensagem "Olá, [NomeDoUsuario]".
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Olá, " + nome);
    }
}