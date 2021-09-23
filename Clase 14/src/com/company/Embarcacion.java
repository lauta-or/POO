package com.company;

public abstract class Embarcacion {
    private Double precioBase;
    private Double valorAdicional;
    private Integer anioFabricacion;
    private Double eslora;
    private Capitan capitan;

    public Embarcacion(Double precioBase, Double valorAdicional, Integer anioFabricacion, Double eslora, Capitan capitan) {
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.anioFabricacion = anioFabricacion;
        this.eslora = eslora;
        this.capitan = capitan;
    }

    public void calcularAlquiler(){
        Double montoAlquiler;

        if(anioFabricacion>2020){
            montoAlquiler = precioBase+valorAdicional;

        }else{
             montoAlquiler= precioBase;
        }

        System.out.println("El precio del alquier es:"+  montoAlquiler);
    }

}
