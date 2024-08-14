package me.marcos;

public class MergeSort {

	public WorldData[] mergeSort(WorldData[] vetor, int ini, int fim) {
		if (ini < fim) {
			int meio = (ini + fim) / 2;
			mergeSort(vetor, ini, meio);
			mergeSort(vetor, meio + 1, fim);

			intercalar(vetor, ini, meio, fim);
		}
		return vetor;
	}

	private void intercalar(WorldData[] vetor, int ini, int meio, int fim) {
		WorldData[] aux = new WorldData[vetor.length];
		for (int i = ini; i <= fim; i++) {
			aux[i] = vetor[i];
		}

		int i = ini;
		int j = meio + 1;
		int k = ini;

		while (i <= meio && j <= fim) {
			if (aux[i].getPlayersOnline() <= aux[j].getPlayersOnline()) {
				vetor[k++] = aux[i++];
			} else {
				vetor[k++] = aux[j++];
			}
		}
		while (i <= meio) {
			vetor[k++] = aux[i++];
		}
		while (j <= fim) {
			vetor[k++] = aux[j++];
		}

	}

}
