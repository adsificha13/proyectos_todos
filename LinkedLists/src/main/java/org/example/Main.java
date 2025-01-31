package org.example;

import com.sun.jdi.connect.spi.TransportService;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Persona> arrayList = new ArrayList<Persona>();
        arrayList.add(new Persona(99,"kevin",331));
        arrayList.add(new Persona(88,"mateo",332));
        arrayList.add(new Persona(66,"fabian",333));
        arrayList.add(new Persona(44,"mario",334));

       LinkedList<Persona> linkedList = new LinkedList<Persona>();
        linkedList.add(new Persona(66,"alejandro",20));
        linkedList.add(new Persona(68,"fernanda",21));
        linkedList.add(new Persona(67,"katerine",24));
        linkedList.add(new Persona(64,"maria",25));

  //Remover ArrayLists
        arrayList.remove(2);

        //Remover
    String NombreBorrar = "katerine";
    for(Persona persona2:linkedList){
        if(persona2.getNombre().equals(NombreBorrar)){
        linkedList.remove(persona2);
        break;
        }
    }
    System.out.println("-----------Luego de Eliminar--------");

        System.out.println("-----------ArrayLists--------");
        for(Persona persona:arrayList){
            System.out.println("prueba: " + persona.getNombre());
        }
        System.out.println("-----------LinkedLists--------");
        for(Persona persona:linkedList){
            System.out.println("prueba: " + persona.getNombre());
        }

        System.out.println("-----------tamaño de lista--------");
        System.out.println("arrayLists " + arrayList.size());
        System.out.println("linkedLists " + linkedList.size());

        System.out.println("-----------Primero y ultimo de la lista--------");
        System.out.println("linkedLists " + linkedList.getFirst().toString());
        System.out.println("linkedLists " + linkedList.getLast().toString());


        System.out.println("-----------Borrar lista--------");
        arrayList.clear();
        linkedList.clear();

        System.out.println("-----------Comprobar si esta vacia--------");
        System.out.println("arrayLists " + arrayList.isEmpty());
        System.out.println("linkedLists " + linkedList.isEmpty());


    }
}