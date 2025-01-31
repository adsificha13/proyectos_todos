package org.example;

public class Cuadro implements Figura, Dibujable{

    private double lado;

    public Cuadro() {
    }

    public Cuadro(double lado) {
        this.lado = lado;
    }

    @Override
    public double culcularArea() {
        double resultado = lado * lado;
        return resultado;
    }

    @Override
    public void dibujar() {
        System.out.println("Hola estoy dibujando un cuadrado");
    }
}
