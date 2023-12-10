public class Main {
    public static void main(String[] args) {
        /* Crie uma bomba relógio (usando somente código - para deixar claro!) cuja contagem regressiva vá de 30 a 0.
        Escreva a contagem em tela e no final da repetição escreva "EXPLOSÃO". */

        for (int i = 30; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("EXPLOSÃO");
    }
}
