package org.example;

public class Perro extends Animal{
    private String nombrePerro;
    private int edad;
    private String raza;
    private String sexo;

    public Perro() {
    }

    protected Perro(int id_animal, String descripcion, String nombrePerro, int edad, String raza, String sexo) {
        super(id_animal, descripcion);
        this.nombrePerro = nombrePerro;
        this.edad = edad;
        this.raza = raza;
        this.sexo = sexo;
    }

    public String getNombrePerro() {
        return nombrePerro;
    }

    public void setNombrePerro(String nombrePerro) {
        this.nombrePerro = nombrePerro;
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
        System.out.println("Soy un perro: GUA GUA");
    }
}
