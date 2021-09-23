package com.company;

public class Velero extends Embarcacion {
    private Integer cantidadMastiles;


    public Velero(Double precioBase, Double valorAdicional, Integer anioFabricacion, Double eslora, Capitan capitan, Integer cantidadMastiles) {
        super(precioBase, valorAdicional, anioFabricacion, eslora, capitan);
        this.cantidadMastiles = cantidadMastiles;
    }

    public void clasificarVelero(){
        if(cantidadMastiles>4){
            System.out.println("El velero es grande");
    }else{
        System.out.println("El velero es pequenio");
    }

}}

