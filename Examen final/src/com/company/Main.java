package com.company;

public class Main {

    public static void main(String[] args) {

        Alumno alumno = new Alumno("silvina", "colonia", 1);

        ExamenFinal examenFinal = new ExamenFinal(alumno, "POO", "examen", 8.0, 6.0,"");
        ExamenFinal otroExamen = new ExamenFinal(alumno, "POO", "examen", 5.0, 5.0, "");

        if(examenFinal.compareTo(otroExamen)>0){
            System.out.println("El primer examen es mejor");
        }else if(examenFinal.compareTo(otroExamen)<0){
            System.out.println("El segundo examen fue mejor");
        }else {
            System.out.println("los examenes son iguales");
        }


    }
}
