import java.util.Arrays;
public class BubbleSort {

    private int[] vetor;


    public BubbleSort(){}

    public int[] getVetor() {
        return vetor;
    }

    public void setVetor(int[] vetor) {
        this.vetor = vetor;
    }

    public int[] bubbleSort(int[] vetor) {
        int aux;
        boolean controle;
        int contador = 0;
        for (int i = 0; i < vetor.length; i++) {
            controle = true;
            for (int j = 0; j < (vetor.length - 1); j++) {
                if (vetor[j] > vetor[j + 1]) {
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                    controle = false;
                    contador++;
                }
            }
            if (controle) {
                break;
            }

        }
        System.out.println("contador: " + contador);
        return vetor;
    }
}
