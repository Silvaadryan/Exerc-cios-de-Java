import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Escreva um programa em Java em que o usuário informe o seu nome e em seguida o programa perguntará a idade do
        usuário. Agora o programa deve exibir a mensagem "Olá, [NomeDoUsuario], sua idade é [idade]". */
        Scanner entradaNome = new Scanner(System.in);

        System.out.print("Informe o seu nome: ");
        String nome = entradaNome.nextLine();

        Scanner entradaIdade = new Scanner(System.in);
        System.out.print("Informe a sua idade: ");
        String idade = entradaIdade.nextLine();

        System.out.print("Olá, " + nome + ", sua idade é " + idade + " anos");
    }
}