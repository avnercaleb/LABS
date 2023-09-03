package org.ordenacao.bubble;

public class BubbleSort {
    public static void main(String[] args) {

        int[] v = new int[]{200, 199, 1720, 1000, 50};

        for(int i = 0; i < v.length; i++){
            for(int j = 0; j < v.length - 1; j++){
                if(v[j] > v[j + 1]){
                    int aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                }
            }
        }

        for(int i : v){
            System.out.print(i + " ");
        }
    }
}
