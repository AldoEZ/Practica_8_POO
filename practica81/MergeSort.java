package mx.unam.fi.poo.g1.p81;

import mx.unam.fi.poo.g1.p81.Ordenamiento;

/**
 * Clase MergeSort
 * @author Aldo Axel Estrada Zacarias
 * @version 08-Octubre-2024
 */

public class MergeSort implements Ordenamiento {
    /**
     * Metodo ordenar para MergeSort
     * Metodo principal de mergeSort que ayuda a ordenar un arreglo.
     * @param arr -> Atributo que da un arreglo de enteros.
     * @param inicio -> Atributo que indica el inicio del arreglo que se tomara en cuenta.
     * @param fin -> Atributo que indica el final del arreglo que se tomara en cuenta.
     */
    @Override
    public void ordenar(int arr[], int inicio, int fin) {
        if (inicio < fin) {
            int mid = (inicio + fin) / 2;
            
            ordenar(arr, inicio, mid);
            ordenar(arr, mid + 1, fin);
            
            merge(arr, inicio, mid, fin);
        }
    }
    
    /**
     * Metodo merge: 
     * Metodo que hace la mezcla de los arreglos.
     * @param arr -> Atributo que da el arreglo.
     * @param inicio -> Atributo que indica el inicio a tomar en cuenta del arreglo.
     * @param mid -> Atributo que indica el punto medio a tomar en cuenta del arreglo.
     * @param fin -> Atributo que indica el fin a tomar en cuenta del arreglo.
     */
    public void merge(int arr[], int inicio, int mid, int fin) {
        int tam1 = mid - inicio + 1;
        int tam2 = fin - mid;
        
        int arrIzq[] = new int[tam1];
        int arrDer[] = new int[tam2];
        
        for (int i = 0; i < tam1; ++i)
            arrIzq[i] = arr[inicio + i];
        for (int j = 0; j < tam2; ++j)
            arrDer[j] = arr[mid + 1 + j];
        
        int izq = 0, der = 0;
        int k = inicio;
        while (izq < tam1 && der < tam2) {
            if (arrIzq[izq] <= arrDer[der]) {
                arr[k] = arrIzq[izq];
                izq++;
            } else {
                arr[k] = arrDer[der];
                der++;
            }
            k++;
        }
        
        while (izq < tam1) {
            arr[k] = arrIzq[izq];
            izq++;
            k++;
        }
        
        while (der < tam2) {
            arr[k] = arrDer[der];
            der++;
            k++;
        }
    }
}
