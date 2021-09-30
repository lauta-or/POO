package com.company;

public class CajaDeAhorro extends Cuenta{

    private Double tasaDeInteres;


    public CajaDeAhorro(Double saldo, Double tasaDeInteres) {
        super(saldo);
        this.tasaDeInteres = tasaDeInteres;
    }

    public void cobrarInteres (){
        System.out.println("Su interes acumulado es de = " + (saldo*tasaDeInteres));
        this.saldo = saldo*(1+tasaDeInteres);
    }
}
