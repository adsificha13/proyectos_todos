package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedLists {
    public static void main(String[] args) {

    //List<Persona> lista = new ArrayList<Persona>();
        List<Persona> lista = new LinkedList<Persona>();

    //agregar personas al final de la lista
    lista.add(new Persona(7,"carrlos",77));
    lista.add(new Persona(8,"paola",80));

    String nombreBorrrar = "paola";
    for(Persona persona11:lista){
        persona11.getNombre().equals(nombreBorrrar);
        lista.remove(persona11);
        break;
    }
    //agregar al principo
    lista.add(0, new Persona(100,"manuel",0));

    for(Persona perso:lista){
        System.out.println("prueba: " + perso.getNombre());
    }

    /*for(int i =0; i< lista.size();i++){
        System.out.println("prueba: " + lista.get(i).getNombre());
    }*/

    }
}
