import java.util.Scanner;

public class Main {
    static double area;
    static void areaRetangulo() {
        Scanner entradaBase = new Scanner(System.in);
        Scanner entradaH = new Scanner((System.in));

        System.out.print("Informe o valor da base: ");
        double base = entradaBase.nextDouble();
        System.out.print("Informe o valor da altura: ");
        double h = entradaH.nextDouble();

        area = base*h;

        System.out.println("O valor da área é " + area + "m²");
    }

    static void areaQuadrado() {
        Scanner entradaLado = new Scanner(System.in);

        System.out.print("Informe o valor do lado do quadrado: ");
        double lado = entradaLado.nextDouble();

        area = lado*lado;

        System.out.println("A área do quadrado é " + area + "m²");

    }

    static void areaLosango() {
        Scanner entradaMaior = new Scanner(System.in);
        Scanner entradaMenor = new Scanner(System.in);

        System.out.print("Informe o valor da diagonal maior: ");
        double diagonalMaior = entradaMaior.nextDouble();
        System.out.print("Informe o valor da diagonal menor: ");
        double diagonalMenor = entradaMenor.nextDouble();

        area = (diagonalMaior*diagonalMenor)/2;

        System.out.println("O valor da área do Losango é " + area + "m²");
    }

    static void areaTrapezio() {
        Scanner entradaMaior = new Scanner(System.in);
        Scanner entradaMenor = new Scanner(System.in);
        Scanner entradaAltura = new Scanner(System.in);

        System.out.print("Informe o valor da base maior: ");
        double baseMaior = entradaMaior.nextDouble();
        System.out.print("Informe o valor da base menor: ");
        double baseMenor = entradaMenor.nextDouble();
        System.out.print("Informe o valor da altura: ");
        double altura = entradaAltura.nextDouble();

        area = ((baseMaior+baseMenor)*altura)/2;

        System.out.println("O valor da área do trapezio é " + area + "m²");
    }

    static void areaParalelograma() {
        Scanner entradaBase = new Scanner(System.in);
        Scanner entradaAltura = new Scanner(System.in);

        System.out.print("Informe o valor da base do Paralelograma: ");
        double base = entradaBase.nextDouble();
        System.out.print("Informe o valor da altura do Paralelograma: ");
        double altura = entradaAltura.nextDouble();

        area = base*altura;

        System.out.println("O valor da área do paralelograma é " + area + "m²");
    }

    static void areaTriangulo() {
        Scanner entradaBase = new Scanner(System.in);
        Scanner entradaAltura = new Scanner(System.in);

        System.out.print("Informe o valor da base do triângulo: ");
        double base = entradaBase.nextDouble();
        System.out.print("Informe o valor da altura do triângulo: ");
        double altura = entradaAltura.nextDouble();

        area = (base*altura)/2;

        System.out.println("O valor da área do triângulo é " + area + "m²");
    }

    static void areaCirculo() {
        Scanner entradaRaio = new Scanner(System.in);

        System.out.print("Informe o valor do raio do círculo: ");
        double raio = entradaRaio.nextDouble();

        area = Math.PI * Math.pow(raio, 2);

        System.out.print("O valor da área do círculo é " + area + "m²");
    }

    static void escolha() {
        Scanner entradaOpcao = new Scanner(System.in);
        System.out.print("Informe a operação matemática que deseja realizar: 1 (Retângulo), 2 (Quadrado), 3 (Losango)," +
                "4 (Trapézio), 5 (Paralelograma), 6 (Triângulo), 7 (Círculo), 8 (Encerrar): ");
        int opcao = entradaOpcao.nextInt();

        switch (opcao) {
            case 1:
                areaRetangulo();
                escolha();
                break;
            case 2:
                areaQuadrado();
                escolha();
                break;
            case 3:
                areaLosango();
                escolha();
                break;
            case 4:
                areaTrapezio();
                escolha();
                break;
            case 5:
                areaParalelograma();
                escolha();
                break;
            case 6:
                areaTriangulo();
                escolha();
                break;
            case 7:
                areaCirculo();
                escolha();
                break;
            case 8:
                break;
            default:
                System.out.println("Informe um valor válido!");
                escolha();
        }
    }

    public static void main(String[] args) {
        /* Considerando a figura abaixo, escreva um programa para cada forma que calcule e exiba em tela cada uma de
        suas respectivas áreas. O usuário irá informar os valores de cada variável. */
        escolha();

        System.out.print("Programa encerrado!");

    }
}