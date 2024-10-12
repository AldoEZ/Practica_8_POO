package mx.unam.fi.poo.g1.p8.e2;

import mx.unam.fi.poo.g1.p8.e2.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        Figura circulo = new Circulo(7.0);
        Figura cilindro = new Cilindro(4.0, 9.0);
        
        dibujaCalula(circulo);
        dibujaCalula(cilindro);
    }
    
    public static void dibujaCalula(Figura figura) {
        figura.dibuja();
        double area = figura.calcularArea();
        System.out.println("Area: " + area);
    } 
}
