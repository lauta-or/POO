package com.company;

public class Main {

    public static void main(String[] args) {
        Capitan capitan = new Capitan("Pepo", "Perez",12345);
        Embarcacion barco = new Yate(25000.0,1200.0, 2021,21.0,capitan, 1);

        barco.calcularAlquiler();
        ((Yate)barco).comaprarYates(1);
    }
}
