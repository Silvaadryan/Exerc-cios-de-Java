// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int alunosAprovados = 0;

        do {
            double somaNotas = 0;
            for (int i = 1; i <= 6; i++) {
                System.out.print("Informe a nota " + i + ": ");
                double nota = scanner.nextDouble();
                somaNotas += nota;
            }

            double mediaFinal = somaNotas / 6;

            if (mediaFinal >= 6.5) {
                System.out.println("Média final: " + mediaFinal);
                System.out.println("Aluno APROVADO!\n");
                alunosAprovados++;
            } else {
                System.out.println("Média final: " + mediaFinal);
                System.out.println("Aluno REPROVADO.\n");
            }

            System.out.print("Calcular a média de outro aluno? (S/N): ");
            String resposta = scanner.next();

            if (!resposta.equalsIgnoreCase("S")) {
                break;
            }

        } while (true);

        System.out.println("Quantidade de alunos aprovados: " + alunosAprovados);

        scanner.close();
    }
}