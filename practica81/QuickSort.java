package mx.unam.fi.poo.g1.p81;

import mx.unam.fi.poo.g1.p81.Ordenamiento;

/**
 * Clase QuickSort
 * @author Aldo Axel Estrada Zacarias
 * @version 08-Octubre-2024
 */

public class QuickSort implements Ordenamiento {
    /**
     * Metodo ordenar para QuickSort
     * Metodo principal  de quicksort que ayuda a ordenar un arreglo.
     * @param arr -> Atributo que da un arreglo de enteros.
     * @param inicio -> Atributo que indica el inicio del arreglo que se tomara en cuenta.
     * @param fin -> Atributo que indica el final del arreglo que se tomara en cuenta.
     */
    @Override
    public void ordenar(int[] arr, int inicio, int fin) {
        if(inicio < fin) {
            int pi = this.particion(arr, inicio, fin);
            
            this.ordenar(arr, inicio, pi-1);
            this.ordenar(arr, pi+1, fin);
        }
    }
    
    /**
     * Metodo particion
     * Hace la particion del arreglo tomando en cuenta un pivote.
     * @param arr -> Atributo que da un arreglo de enteros.
     * @param inicio -> Atributo que indica el inicio del arreglo que se tomara en cuenta.
     * @param fin -> Atributo que indica el final del arreglo que se tomara en cuenta.
     * @return i+1 -> Regresa la posicion del elemento pivote el cual quedo en su lugar.
     */
    public int particion(int[] arr, int inicio, int fin) {
        int pivote = arr[fin];
        
        int i = inicio - 1;
        
        for(int j = inicio; j < fin; j++) {
            if(arr[j] < pivote) {
                i++;
                int aux = arr[j];
                arr[j] = arr[i];
                arr[i] = aux;
            }
        }
        
        int aux = arr[i+1];
        arr[i+1] = arr[fin];
        arr[fin] = aux;
        
        return i+1;
    }
}
