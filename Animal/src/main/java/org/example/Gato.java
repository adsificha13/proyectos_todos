package org.example;

public class Gato extends Animal{

    private String nombreGato;
    private int edad;
    private String raza;
    private String sexo;

    public Gato() {
    }

    protected Gato(int id_animal, String descripcion, String nombreGato, int edad, String raza, String sexo) {
        super(id_animal, descripcion);
        this.nombreGato = nombreGato;
        this.edad = edad;
        this.raza = raza;
        this.sexo = sexo;
    }

    public String getNombreGato() {
        return nombreGato;
    }

    public void setNombreGato(String nombreGato) {
        this.nombreGato = nombreGato;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public void hacerSonido() {
        System.out.println("Soy un Gato: Mia Mia");
    }
}
