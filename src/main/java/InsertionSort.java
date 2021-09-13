public class InsertionSort {
    static int[] insertionSort(int[] vetor) {
        int[] vetorAux = vetor;

        int j;
        int key;
        int i;

        for (j = 1; j < vetorAux.length; j++) {
            key = vetorAux[j];
            for (i = j - 1; (i >= 0) && (vetorAux[i] > key); i--) {
                vetorAux[i + 1] = vetorAux[i];
            }
            vetorAux[i + 1] = key;
        }
        return vetor;
    }
}