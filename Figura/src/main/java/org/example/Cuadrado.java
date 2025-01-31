package org.example;

public class Cuadrado extends Figura{

    private double lado;

    private Cuadrado() {
    }

    private Cuadrado(double x, double y, double lado) {
        super(x,y);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        double resultado = lado * lado;
        return resultado;
    }
}
