package com.company;

public class Main {

    public static void main(String[] args) {

        Cuenta cuenta1 = new CuentaCorriente (1000.0, 500.0);

        cuenta1.depositar(500.0);
        cuenta1.informarSaldo();
        cuenta1.extraerEfectivo(1700.0);
        cuenta1.informarSaldo();

        Cuenta cuenta2 = new CajaDeAhorro(500.0,0.2);
        cuenta2.depositar(400.0);
        cuenta2.informarSaldo();
        ((CajaDeAhorro)cuenta2).cobrarInteres();
        cuenta2.informarSaldo();

    }


}
