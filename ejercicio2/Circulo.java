package mx.unam.fi.poo.g1.p8.e2;

import mx.unam.fi.poo.g1.p8.e2.Figura;

class Circulo extends Figura {
    private double radio;
    
    public Circulo(double radio) {
        setRadio(radio);
    }
    
    public double getRadio() {
        return this.radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    @Override
    public  void dibuja() {
        System.out.println("Mas adelante van a usar graficos en Java...");
    }
    
    @Override
    public double calcularArea() {
        return Math.PI * getRadio() * getRadio();
    }
}
