package org.example;

public abstract class Animal {
   private int id_animal;
   private String descripcion;

    public Animal() {
    }

    public Animal(int id_animal, String descripcion) {
        this.id_animal = id_animal;
        this.descripcion = descripcion;
    }


    public abstract void hacerSonido();




}
