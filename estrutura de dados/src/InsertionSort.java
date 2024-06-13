public class InsertionSort {

    public InsertionSort(){}

    public int[] insertionSort(int[] vetor){
        int aux, j;
        int cont = 0;
        for (int i = 1; i < vetor.length; i++){
            aux = vetor[i];
            j = i - 1;
            cont++;
            while (j >= 0 && vetor[j] > aux) {
                vetor[j+1] = vetor[j];
                j--;
            }
            vetor[j+1] = aux;
        }
        System.out.println("contador: " + cont);
        return vetor;
    }

}
