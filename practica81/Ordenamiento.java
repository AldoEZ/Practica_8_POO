package mx.unam.fi.poo.g1.p81;

/**
 * Interfaz Ordenamiento
 * @author Aldo Axel Estrada Zacarias
 * @version 08-Octubre-2024
 */

public interface Ordenamiento {
    /**
     * Cuerpo Metodo ordenar
     * Metodo a sobreescrbir en clases implementadas.
     * @param arr -> Atributo que da un arreglo de enteros.
     * @param inicio -> Atributo que indica el inicio del arreglo que se tomara en cuenta.
     * @param fin -> Atributo que indica el final del arreglo que se tomara en cuenta.
     */
    void ordenar(int[] arr, int inicio, int fin);
}
