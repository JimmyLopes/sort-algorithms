public class SelectionSort {
    static int[] selectionSort(int[] vetor) {
        int[] vetorAux = vetor;
        for (int fixo = 0; fixo < vetorAux.length - 1; fixo++) {
            int menor = fixo;

            for (int i = menor + 1; i < vetorAux.length; i++) {
                if (vetorAux[i] < vetorAux[menor]) {
                    menor = i;
                }
            }
            if (menor != fixo) {
                int t = vetorAux[fixo];
                vetorAux[fixo] = vetorAux[menor];
                vetorAux[menor] = t;
            }
        }
        return vetor;
    }
}