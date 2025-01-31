package org.example;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {

       List<Persona> lista = new ArrayList<Persona>(); //POSICION DINAMICA EN MEMORIA
        lista.add(new Persona(1,"juan",14));
        lista.add(new Persona(2,"mario",18));
        lista.add(new Persona(3,"cristian",28));
        lista.add(new Persona(4,"jhon",26));

    //recorrer lista por indice tamaño
        for(int i=0; i<lista.size(); i++){
            System.out.println("Prueba " + lista.get(i).getNombre());
        }
        System.out.println("--------------------------------------");
    //recorrer foreach
        for(Persona perso:lista){
            System.out.println("prueba: " + perso.getNombre());
        }

    }
}
