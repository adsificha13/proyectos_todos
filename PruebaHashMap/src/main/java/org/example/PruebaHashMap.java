package org.example;

import java.util.HashMap;
import java.util.Map;

public class PruebaHashMap {

    public static void main(String[] args) {
    //clave valor
        Map<Integer,String> datosEmpleados = new HashMap<>();
        //crear
        datosEmpleados.put(333,"Ramires");
        datosEmpleados.put(222,"juan perez");
        datosEmpleados.put(111,"j hernandez");

        //preguntar
        boolean estaoNo = datosEmpleados.containsValue("Customize Toolbar...");
        if(estaoNo==true){
            System.out.println("El valor buscado esta");
        }else{
            System.out.println("El valor No esta");
        }

        boolean estaSI = datosEmpleados.containsKey(333);
        if(estaSI==true){
            System.out.println("El valor buscado Si esta");
        }else{
            System.out.println("El valor No esta");
        }

        // listar todos los valores
        System.out.println(datosEmpleados.values());
        // listar todos las Key
        System.out.println(datosEmpleados.keySet());

        //remover
        datosEmpleados.remove(111);

        //almacenar datos en una variable
        String nombre = datosEmpleados.get(111);
        if(nombre==null) {
            System.out.println("El key ingresado no es correcto o no existe");
        }else{
            System.out.println(nombre);
        }


    }
}
