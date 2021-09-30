package com.company;

public abstract class Cuenta {
    protected Double saldo;

    public Cuenta(Double saldo) {
       this.saldo = saldo;
    }

    public void extraerEfectivo(Double efectivo){
        if(efectivo <= saldo) {
            this.saldo -= efectivo;
        }else {
            System.out.println("No tienes suficiente saldo");
        }
        }

    public  void depositar(Double monto){
        this.saldo += monto;
    }

    public void informarSaldo (){
        System.out.println("Su saldo es de "+saldo);
    }
}
