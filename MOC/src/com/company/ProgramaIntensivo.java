package com.company;

import java.util.ArrayList;
import java.util.List;

public class ProgramaIntensivo extends OfertaAcademica{

    private Double descuento;
    private List <OfertaAcademica> ofertasAcademicas;


    public ProgramaIntensivo(String nombre, String descripcion, Double descuento) {
        super(nombre, descripcion);
        this.descuento = descuento;
        ofertasAcademicas = new ArrayList<>();
    }

    public void agregarOferta (OfertaAcademica ofertaAcademica){ ofertasAcademicas.add(ofertaAcademica);}

    @Override
    public Double informarPrecio() {
        Double precioTotal = 0.0;
        for (OfertaAcademica ofertaAcademica : ofertasAcademicas) {
            precioTotal += ofertaAcademica.informarPrecio();
        }
        precioTotal -= (precioTotal * descuento);
        return precioTotal;
    }
}
