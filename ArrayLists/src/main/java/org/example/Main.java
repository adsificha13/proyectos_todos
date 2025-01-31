package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        List<Persona> lista = new ArrayList<Persona>();

        lista.add(new Persona(2,"cris",33));
        lista.add(new Persona(5,"ana",22));
        lista.add(new Persona(7,"camila",11));
        lista.add(new Persona(9,"fer",44));

        for(int i=0; i<lista.size();i++){
            System.out.println("Los datos son:" + lista.get(i).getNombre());
        }

    }
}