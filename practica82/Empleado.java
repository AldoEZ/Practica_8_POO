package mx.unam.fi.poo.g1.p82;

/**
 * Clase Empleado
 * @author Aldo Axel Estrada Zacarias
 * @version 10-Octubre-2024
 */

public abstract class Empleado {
    private String nombre;
    private String rol;
    
    /**
     * Metodo constructor
     * Para constuir objetos de tipo Empleado
     * @param nombre -> Atributo para asignar nombre al empleado.
     * @param rol -> Atributo para asignar un rol al empleado.
     */
    public Empleado(String nombre, String rol) {
        setNombre(nombre);
        setRol(rol);
    }
    
    /**
     * Metodo set
     * @param nombre -> Atributo para asignar un nombre.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Metodo get
     * @return nombre -> Regresa el atributo nombre.
     */
    public String getNombre() {
        return this.nombre;
    }
    
    /**
     * Metodo set
     * @param rol -> Atributo que designa un rol.
     */
    public void setRol(String rol) {
        this.rol = rol;
    }
    /**
     * Metodo get
     * @return rol -> Regresa el atributo rol.
     */
    public String getRol() {
        return this.rol;
    }
    
    /**
     * Metodo calcularSalario: 
     * Metodo abstracto para calcular el salario de un empleado.
     * @param horasTrabajadas -> Atributo que da las horas trabajadas de un empleado.
     * @param pagoPorHora -> Atributo que da el pago por hora de un empleado.
     * @param bonos -> Atributo que da los bonos de un empleado.
     * @param impuestos -> Atributo que da los impuestos de un empleado.
     */
    public abstract void calcularSalario(int horasTrabajadas, double pagoPorHora, double bonos, double impuestos);
}
