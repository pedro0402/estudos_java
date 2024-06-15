public class SelectionSort {

    public SelectionSort(){}

    public int[] selectionSort(int[] vetor) {
        int posicao_menor, aux;
        int contador = 0;
        for (int i = 0; i < vetor.length; i++) {
            posicao_menor = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[posicao_menor]) {
                    posicao_menor = j;
                }
            }
            aux = vetor[posicao_menor];
            vetor[posicao_menor] = vetor[i];
            vetor[i] = aux;
            contador++;
        }
        System.out.println("contador: " + contador);
        return vetor;
    }

}
