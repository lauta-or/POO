package com.company;

public class Yate extends Embarcacion {
    private Integer canidadCamarotes;

    public Yate(Double precioBase, Double valorAdicional, Integer anioFabricacion, Double eslora, Capitan capitan, Integer canidadCamarotes) {
        super(precioBase, valorAdicional, anioFabricacion, eslora, capitan);
        this.canidadCamarotes = canidadCamarotes;
    }


    public void comaprarYates(Integer canidadCamarotes){
        if(canidadCamarotes > 2){
            System.out.println("tu yate es re lujoso pa");
        }else{
            System.out.println("te alquilaste un yate barat");
        }

    }
}
