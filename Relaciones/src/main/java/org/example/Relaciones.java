package org.example;

import java.util.ArrayList;

public class Relaciones {
    public static void main(String[] args) {
        //cree auto
        Auto autico = new Auto();
            autico.setId(1L);
            autico.setMarca("for");
            autico.setModelo("2001");
        //cree lista
        ArrayList<Propietario> listaPropietarios = new ArrayList<Propietario>();
        //cree 2 propietarios vacios
        Propietario pro1 = new Propietario();
        Propietario pro2 = new Propietario();
        //asignacion valores
            pro1.setId(26L);
            pro1.setNombre("camilo");
            pro1.setApellido("perez");
            pro2.setId(22L);
            pro2.setNombre("juan");
            pro2.setApellido("valencia");

        //le paso 2 pro a la lista
        listaPropietarios.add(pro1);
        listaPropietarios.add(pro2);

        //auto le set la lista de pro asigne lista
        autico.setListaPropietarios(listaPropietarios);


        System.out.println("El auto: " + autico.getId() + " " + autico.getMarca() + " " + autico.getModelo() + " tiene como propietarios a: " + autico.getListaPropietarios().toString());
    }
}