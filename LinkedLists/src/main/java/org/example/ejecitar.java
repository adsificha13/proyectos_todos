package org.example;

import java.util.ArrayList;
import java.util.LinkedList;

public class ejecitar {
    public static void main(String[] args) {

        ArrayList<Persona> arrayList = new ArrayList<Persona>();

        arrayList.add(new Persona(5,"diego",2));
        arrayList.add(new Persona(6,"lucho",4));


        LinkedList<Persona> linkedList = new LinkedList<Persona>();
        linkedList.add(new Persona(3,"richard",9));
        linkedList.add(new Persona(8,"camila",10));

        //remover
        arrayList.remove(1);

        String borrarNombre="camila";
        for(Persona persona1:linkedList){
            if(persona1.getNombre().equals(borrarNombre)) {
                linkedList.remove(persona1);
                break;
            }
        }


        for(Persona persona3:arrayList) {
            System.out.println("prueba: " + persona3.getNombre());
        }

        for(Persona persona4:linkedList) {
            System.out.println("prueba: " + persona4.getNombre());
        }



    }
}
