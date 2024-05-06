
package com.mycompany.figurasgeometricaspoo;

class TrianguloIsosceles extends FiguraGeometrica {
    private double primerLado;
    private double segundoLado;
    private double tercerLado;
    
    //Complejidad temporal: O(1) Tiempo constante.

    public TrianguloIsosceles(String nombre, String color, double primerLado, double segundoLado, double tercerLado) {
        super(nombre, color);
        this.primerLado = primerLado;
        this.segundoLado = segundoLado;
        this.tercerLado = tercerLado;
    }
    
    //Complejidad temporal: O(1) Tiempo constante.

    public double getPrimerLado() {
        return primerLado;
    }
    
    //Complejidad temporal: O(1) Tiempo constante.

    public void setPrimerLado(double primerLado) {
        this.primerLado = primerLado;
    }
    
    //Complejidad temporal: O(1) Tiempo constante.
    
    public double getSegundoLado() {
        return segundoLado;
    }
    
    //Complejidad temporal: O(1) Tiempo constante.
    
    public void setSegundoLado(double segundoLado) {
        this.segundoLado = segundoLado;
    }
    
    //Complejidad temporal: O(1) Tiempo constante.

    public double getTercerLado() {
        return tercerLado;
    }
    
    //Complejidad temporal: O(1) Tiempo constante.

    public void setgetTercerLado(double tercerLado) {
        this.tercerLado = tercerLado;
    }
    
    //Complejidad temporal: O(1) Tiempo constante.

    @Override
    public double obtenerArea() {
        return (primerLado * segundoLado) / 2;
    }

    //Complejidad temporal: O(1) Tiempo constante.
    
    @Override
    public double obtenerPerimetro() {
        return primerLado + segundoLado + tercerLado;
    }
}