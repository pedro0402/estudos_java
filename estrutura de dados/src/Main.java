import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        //Gerar valores aleatórios para o vetor

        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++){
            vetor[i] = (int) (Math.random() * vetor.length);
        }

        //Vetor antes de ser ordenado
        System.out.println("Desordenado: ");
        System.out.println(Arrays.toString(vetor));

        System.out.println("--------------------------------------");

        //Algoritmo Bubble Sort

        BubbleSort bubbleSort = new BubbleSort();

        System.out.println(Arrays.toString(bubbleSort.bubbleSort(vetor)));

        System.out.println("--------------------------------------");

        //Algoritmo Insertion Sort

        InsertionSort insertionSort = new InsertionSort();
        System.out.println(Arrays.toString(insertionSort.insertionSort(vetor)));

    }
}
