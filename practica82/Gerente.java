package mx.unam.fi.poo.g1.p82;

import mx.unam.fi.poo.g1.p82.Empleado;

/**
 * Clase Gerente
 * @author Aldo Axel Estrada Zacarias
 * @version 10-Octubre-2024
 */

public class Gerente extends Empleado {
    /**
     * Metodo constructor: 
     * Para construir objetos Gerente.
     * @param nombre -> Atributo para asginar nombre.
     * @param rol -> Atributo para asginar rol.
     */
    public Gerente(String nombre, String rol) {
        super(nombre, rol);
    }
    
    /**
     * Metodo calcularSalario: 
     * Metodo abstracto para calcular el salario de un gerente.
     * @param horasTrabajadas -> Atributo que da las horas trabajadas de un gerente.
     * @param pagoPorHora -> Atributo que da el pago por hora de un gerente.
     * @param bonos -> Atributo que da los bonos de un gerente.
     * @param impuestos -> Atributo que da los impuestos de un gerente.
     */
    @Override
    public void calcularSalario(int horasTrabajadas, double pagoPorHora, double bonos, double impuestos) {
        System.out.println("--Gerente--\nTrabajo " + horasTrabajadas + " horas.\nSu pago por hora es de $" 
                            + pagoPorHora + "\nTiene un total de bonos de: $" + bonos + ".\nSus impuestos son del " 
                            + (impuestos*100) + "%.");
        double salario = (horasTrabajadas * pagoPorHora) + bonos;
        double impuesto = salario * impuestos;
        double salarioFinal = salario - impuesto;
        System.out.println("\nSu salario final es de: $" + salarioFinal);
    }
    
    /**
     * Metodo toString: 
     * Metodo sobreescrito para mostrar la informacion de un gerente.
     * @return String -> Retorna una string con los datos del gerente.
     */
    @Override
    public String toString() {
        return "\nEl gerente " + super.getNombre() + " tiene el rol de: " + super.getRol();
    }
}
