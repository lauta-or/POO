package com.company;

import java.util.ArrayList;
import java.util.List;

public class Instituto {

    private List <OfertaAcademica> ofertasAcademicas;

    public Instituto() {
        ofertasAcademicas = new ArrayList<>();
    }

    public void generarInforme() {
        for (OfertaAcademica ofertasAcademica : ofertasAcademicas) {
            System.out.println(ofertasAcademica);
        }

    }

    public void agregarOfertaAcademica(String nombreOferta) {
        ofertasAcademicas.add(OfertaAcademicaFactory.getInstance().crearOfertaAcademica(nombreOferta));

    }

}
