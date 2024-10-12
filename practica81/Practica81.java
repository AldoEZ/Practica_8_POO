package mx.unam.fi.poo.g1.p81;

import mx.unam.fi.poo.g1.p81.*;

/**
 * Clase principal de Practica 8_1
 * @author Aldo Axel Estrada Zacarias
 * @version 08-Octubre-2024
 */

public class Practica81 {
    /**
     * Método main
     * Se ejecuta toda la aplicacion.
     * @param args -> Arreglo por defecto del método main.
     */
    public static void main(String[] args) {
        Ordenamiento quickSort = new QuickSort();
        Ordenamiento mergeSort = new MergeSort();
        
        int[] arr1 = {4, 2, 0, 3, 1, 6, 8};
        int inicio = 0;
        int fin = arr1.length - 1;
        quickSort.ordenar(arr1, inicio, fin);
        System.out.println("--Quick Sort--");
        imprime(arr1);
        
        int[] arr2 = {14, 12, 10, 13, 11, 16, 18};
        inicio = 0;
        fin = arr2.length - 1;
        mergeSort.ordenar(arr2, inicio, fin);
        System.out.println("--Merge Sort--");
        imprime(arr2);
    }
    /**
     * Metodo imprime
     * Metodo estatico que imprime un arreglo dentro de la clase principal
     * @param arr1 -> Atributo que da el arreglo a imprimir.
     */
    public static void imprime(int[] arr1) {
        for(int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
