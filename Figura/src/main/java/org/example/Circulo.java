package org.example;

public class Circulo extends Figura{
    private double radio;

    private Circulo() {
    }

    private Circulo(double x, double y, double radio) {
        super(x,y);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        double pi = 3.14;
        double resultado = pi * radio * radio;
        return resultado;
    }
}
