import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        //Gerar valores aleatórios para o vetor

        int[] vetor = new int[15];

        for (int i = 0; i < vetor.length; i++){
            vetor[i] = (int) (Math.random() * vetor.length);
        }

        //Vetor antes de ser ordenado
        System.out.println("Desordenado: ");
        System.out.println(Arrays.toString(vetor));

        System.out.println("--------------------------------------");

        //Algoritmo Bubble Sort
        System.out.println("\nBubble");
        BubbleSort bubbleSort = new BubbleSort();

        System.out.println(Arrays.toString(bubbleSort.bubbleSort(vetor)));

        System.out.println("--------------------------------------");

        //Algoritmo Insertion Sort

        System.out.println("\nInsertion");
        InsertionSort insertionSort = new InsertionSort();

        System.out.println(Arrays.toString(insertionSort.insertionSort(vetor)));

        System.out.println("--------------------------------------");

        //Algoritmo Selection Sort

        System.out.println("\nSelection");
        SelectionSort selectionSort = new SelectionSort();

        System.out.println(Arrays.toString(selectionSort.selectionSort(vetor)));

        System.out.println("--------------------------------------");

        //Algoritmo Quick Sort

        System.out.println("\nQuick");
        QuickSort quickSort = new QuickSort();

        System.out.println(Arrays.toString(quickSort.quickSort(vetor, 0, vetor.length-1)));
        System.out.println("contador: "+ QuickSort.contagem);
    }
}
