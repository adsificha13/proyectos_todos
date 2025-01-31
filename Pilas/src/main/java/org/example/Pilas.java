package org.example;

import java.util.Stack;

public class Pilas {
    public static void main(String[] args) {

        Stack<Integer> pila = new Stack<Integer>();

        System.out.println("Pila vacia" + pila);
        System.out.println("Esta vacia " + pila.isEmpty());

        //agregar
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);

        //recorrer
        for(Integer pilas1:pila){
            System.out.println(pilas1);
        }

        //elimimar ultomo registro
        pila.pop();

        //buscar
        System.out.println("esta el numero 2: " + pila.search(2));

        System.out.println("Ultimo agregado: " +pila.peek());



    }
}
