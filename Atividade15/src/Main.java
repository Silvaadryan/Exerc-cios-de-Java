// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /* Anacleto tem 1,50 metro e cresce 2 centímetros por ano, enquanto Felisberto tem 1,1O metro e cresce 3 centímetros por ano. Construa um
        algoritmo que calcule e imprima quantos anos serão necessários para que Felisberto seja maior que Anacleto. */
        double anacleto = 1.50;
        double felisberto = 1.10;
        int ano = 0;
        do {
            anacleto = anacleto + 0.02;
            felisberto = felisberto + 0.03;
            ano = ano + 1;
        }
        while (felisberto < anacleto);
        System.out.print(ano);
    }
}