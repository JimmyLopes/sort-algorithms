public class BubbleSort {
    static int[] bubbleSort(int[] vetor) {
        int[] vetorAux = vetor;

        boolean troca = true;
        int aux;
        while (troca) {
            troca = false;
            for (int i = 0; i < vetorAux.length - 1; i++) {
                if (vetorAux[i] > vetorAux[i + 1]) {
                    aux = vetorAux[i];
                    vetorAux[i] = vetorAux[i + 1];
                    vetorAux[i + 1] = aux;
                    troca = true;
                }
            }
        }
        return vetor;
    }
}
