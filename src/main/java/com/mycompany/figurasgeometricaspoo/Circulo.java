package com.mycompany.figurasgeometricaspoo;

class Circulo extends FiguraGeometrica {
    private double radio;
    
    //Complejidad temporal: O(1) Tiempo constante.

    public Circulo(String nombre, String color, double radio) {
        super(nombre, color);
        this.radio = radio;
    }
    
    //Complejidad temporal: O(1) Tiempo constante.
    
    public double getRadio() {
        return radio;
    }
    
    //Complejidad temporal: O(1) Tiempo constante.
    
    public void setRadio(double radio) {
        this.radio = radio;
    }

    //Complejidad temporal: O(1) Tiempo constante.
    
    @Override
    public double obtenerArea() {
        return Math.PI * radio * radio;
    }

    //Complejidad temporal: O(1) Tiempo constante.
    
    @Override
    public double obtenerPerimetro() {
        return 2 * Math.PI * radio;
    }
}

