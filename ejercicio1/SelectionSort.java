package mx.unam.fi.poo.g1.p8.e1;

import mx.unam.fi.poo.g1.p8.e1.Ordenamiento;

class SelectionSort implements Ordenamiento {
    public void ordenar(int[] arr) {
        int n = arr.length;
        
        for(int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for(int j = i + 1; j < n; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int aux = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = aux;
        }
    }
}
