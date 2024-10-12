package mx.unam.fi.poo.g1.p82;

import mx.unam.fi.poo.g1.p82.Empleado;

/**
 * Clase Programador
 * @author Aldo Axel Estrada Zacarias
 * @version 10-Octubre-2024
 */

public class Programador extends Empleado {
    /**
     * Metodo constructor: 
     * Para construir objetos Programador.
     * @param nombre -> Atributo para asginar nombre.
     * @param rol -> Atributo para asginar rol.
     */
    public Programador(String nombre, String rol) {
        super(nombre, rol);
    }
    
    /**
     * Metodo calcularSalario: 
     * Metodo abstracto para calcular el salario de un programador.
     * @param horasTrabajadas -> Atributo que da las horas trabajadas de un programador.
     * @param pagoPorHora -> Atributo que da el pago por hora de un programador.
     * @param bonos -> Atributo que da los bonos de un programador.
     * @param impuestos -> Atributo que da los impuestos de un programador.
     */
    @Override
    public void calcularSalario(int horasTrabajadas, double pagoPorHora, double bonos, double impuestos) {
        System.out.println("--Programador--\nTrabajo " + horasTrabajadas + " horas.\nSu pago por hora es de $" 
                            + pagoPorHora + "\nTiene un total de bonos de: $" + bonos + ".\nSus impuestos son del " 
                            + (impuestos*100) + "%.");
        double salario = (horasTrabajadas * pagoPorHora) + bonos;
        double impuesto = salario * impuestos;
        double salarioFinal = salario - impuesto;
        System.out.println("\nSu salario final es de: $" + salarioFinal);
    }
    
    /**
     * Metodo toString: 
     * Metodo sobreescrito para mostrar la informacion de un programador.
     * @return String -> Retorna una string con los datos del programador.
     */
    @Override
    public String toString() {
        return "\nEl programador " + super.getNombre() + " tiene el rol de: " + super.getRol();
    }
}
