public class QuickSort {

    static int[] quickSort(int[] vetor, int inicio, int fim) {
        int[] vetorAux = vetor;
        if (inicio < fim) {
            int posicaoPivo = separar(vetorAux, inicio, fim);
            quickSort(vetorAux, inicio, posicaoPivo - 1);
            quickSort(vetorAux, posicaoPivo + 1, fim);
        }
        return vetor;
    }

    static int separar(int[] vetor, int inicio, int fim) {
        int pivo = vetor[inicio];
        int i = inicio + 1, f = fim;
        while (i <= f) {
            if (vetor[i] <= pivo)
                i++;
            else if (pivo < vetor[f])
                f--;
            else {
                int troca = vetor[i];
                vetor[i] = vetor[f];
                vetor[f] = troca;
                i++;
                f--;
            }
        }
        vetor[inicio] = vetor[f];
        vetor[f] = pivo;
        return f;
    }

}
