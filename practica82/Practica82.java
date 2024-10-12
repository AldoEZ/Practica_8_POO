package mx.unam.fi.poo.g1.p82;

import mx.unam.fi.poo.g1.p82.*;

/**
 * Clase principal de Practica 8_2
 * @author Aldo Axel Estrada Zacarias
 * @version 10-Octubre-2024
 */

public class Practica82 {
    /**
     * Método main
     * Se ejecuta toda la aplicacion.
     * @param args -> Arreglo por defecto del método main.
     */
    public static void main(String[] args) {
        Empleado programador = new Programador("Carlos Herrera Jiménez","Programador Full-Stack");
        Empleado gerente = new Gerente("Miguel Pérez López","Gerente de Proyectos");
        
        System.out.println(programador);
        programador.calcularSalario(48, 35.0, 500.0, 0.1);
        
        System.out.println(gerente);
        gerente.calcularSalario(40, 55, 200.5, 0.15);
    }
}
