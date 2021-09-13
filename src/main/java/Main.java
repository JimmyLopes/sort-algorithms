import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        calculaTempoInsert(geraVetor(), "InsertionSort");
        calculaTempoQuick(geraVetor(), "QuickSort");
        calculaTempoBubble(geraVetor(), "BubbleSort");
        calculaTempoSelection(geraVetor(), "SelectionSort");
    }

    private static void calculaTempoInsert(int[] vetor, String text) {

        long tempoInicial = System.currentTimeMillis();

        InsertionSort.insertionSort(vetor);

        long tempoFinal = System.currentTimeMillis();

        System.out.println(text + " executado em = " + (tempoFinal - tempoInicial) + " ms");
    }

    private static void calculaTempoBubble(int[] vetor, String text) {

        long tempoInicial = System.currentTimeMillis();

        BubbleSort.bubbleSort(vetor);

        long tempoFinal = System.currentTimeMillis();

        System.out.println(text + " executado em = " + (tempoFinal - tempoInicial) + " ms");
    }

    private static void calculaTempoQuick(int[] vetor, String text) {
        long tempoInicial = System.currentTimeMillis();

        QuickSort.quickSort(vetor, 0, vetor.length - 1);

        long tempoFinal = System.currentTimeMillis();

        System.out.println(text + " executado em = " + (tempoFinal - tempoInicial) + " ms");
    }

    private static void calculaTempoSelection(int[] vetor, String text) {

        long tempoInicial = System.currentTimeMillis();

        SelectionSort.selectionSort(vetor);

        long tempoFinal = System.currentTimeMillis();

        System.out.println(text + " executado em = " + (tempoFinal - tempoInicial) + " ms");
    }


    private static int[] geraVetor() {
        int quantidade = 1000000;
        int[] vetor = new int[quantidade];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * quantidade);
        }
        return vetor;
    }
}
