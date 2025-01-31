package org.example;

public class Main {
    public static void main(String[] args) {

        Perro perri1 = new Perro(5,"perro","bruno",50,"pipull","maculino");
        Perro perri2 = new Perro();
        Gato Gati1 = new Gato(7,"gato","feliz",9,"felina","maculino");
        Gato Gati2 = new Gato();


        System.out.println("Hola Soy: " + perri1.getNombrePerro() + " Mi edad es: " + perri1.getEdad());

    

    }
}