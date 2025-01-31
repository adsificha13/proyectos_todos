package org.example;

public class Main {
    public static void main(String[] args) {

        /*try {
            int restltado = 3/0;
        }catch (Exception e){
            System.out.println("no se puede dividir por 0");
        }*/

        //vetores en arrays
        int edades[] = {12,3,8,25};
        try {
            System.out.println("La edad de la posicion 4 es: " + edades[4]);
        }catch (Exception E){
            System.out.println("El indice no existe");
        }


    }
}