package org.ordenacao.selection;

public class SelectionSort {
    public static void main(String[] args) {

        int[] vetor = new int[]{1, 10, 13, 7, 5};
        int i, j, posMenor, aux;

        for(i = 0; i < vetor.length; i++){
            posMenor = i;

            for(j = i + 1; j < vetor.length; j++){
                if(vetor[j] < vetor[posMenor]){
                    posMenor = j;
                }
            }
            aux = vetor[posMenor];
            vetor[posMenor] = vetor[i];
            vetor[i] = aux;
        }
        for(int n : vetor)
            System.out.println(n + " ");
    }
}
