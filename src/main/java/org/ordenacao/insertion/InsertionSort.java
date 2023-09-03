package org.ordenacao.insertion;

public class InsertionSort {
    public static void main(String[] args) {

        int[] v = new int[]{1, 10, 13, 7, 5};
        int i, j, key;

        for(i = 1; i < v.length; i++){
            key = v[i];
            j = i - 1;

            while(j >= 0 && v[j] > key){
                v[j + 1] = v[j];
                j--;
            }
            v[j + 1] = key;
        }

        for(int n : v){
            System.out.println(n + " ");
        }
    }
}
