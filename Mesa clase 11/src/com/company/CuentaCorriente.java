package com.company;

public class CuentaCorriente extends Cuenta {

    private Double giroEnDescubierto;

    public CuentaCorriente(Double saldo, Double giroEnDescubierto) {
        super(saldo);
        this.giroEnDescubierto = giroEnDescubierto;
    }

    @Override
    public void extraerEfectivo (Double efectivo){
        if(efectivo <= saldo+giroEnDescubierto) {
            this.saldo -= efectivo;
        }else {
            System.out.println("No tienes suficiente saldo");
        }
    }};
