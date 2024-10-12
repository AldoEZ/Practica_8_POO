package mx.unam.fi.poo.g1.p8.e1;

import mx.unam.fi.poo.g1.p8.e1.Ordenamiento;

class BubbleSort implements Ordenamiento {
    public void ordenar(int[] arr) {
        int n = arr.length;
        
        for(int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n - i - 1; j++) {
                if(arr[j] > arr[j+1]) {
                    int aux = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = aux;
                }
            }
        }
    }
}
