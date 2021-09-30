package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        //scanner
        Scanner scanner = new Scanner (System.in);
        System.out.println( "Ingresa tu nombre");
        String nombre  = scanner.nextLine();
        System.out.println( "Ingresa tu edad ");
        Integer edad = scanner.nextInt();

        //condicional
        if  ( edad >= 10 ){
            System.out.println("Podes Subir");
            }else{
            System.out.println("No podes subir");
            }

        //Ejercicio 1 Playground

        Integer numero1 = 10;
        Integer numero2 = 5;


        if (numero1%numero2 == 0 ){
            System.out.println("Es divisible");
           }else{
            System.out.println("No es divisible");
        }

        String miNombre = "Silvina";
        String tuNombre = "Lautaro";
        System.out.println(miNombre.equals(tuNombre));
        //System.out.println(miNombre);

        //En clases no se usa ==

           if (numero1.equals(numero2)){
                System.out.println("Son iguales");
            }else{
                System.out.println("Son distintos");
            }

        System.out.println(numero2.compareTo(numero1));

    }
}

//DUDA compareTo arroja un -1. que quiere decir?

//int, float, double y char = variables del tipo primitivo (Solo datos)
//String, Integer, Float = clases ( aparte de datos tienen metodos) (inicial en mayusc)
//Paquetes = agrupan clases

