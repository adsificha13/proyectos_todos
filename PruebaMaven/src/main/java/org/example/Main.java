package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();

        map.put(444,"jorge");

        boolean nombreEsta = map.containsValue("jorge");
        if(nombreEsta==true){
            System.out.println(nombreEsta + "ESta");
        }else {
            System.out.println("No esta");
        }

        System.out.println(map.values());
        System.out.println(map.keySet());

        String nombre = map.get("jorge");
        if(nombre==null){
            System.out.println("valor correcto");
        }else {
            System.out.println("incorrecto");
        }


        System.out.println("Hello world!");
    }
}