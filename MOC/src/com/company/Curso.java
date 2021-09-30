package com.company;

public class Curso extends OfertaAcademica {
    private Integer duracionMeses;
    private Integer horasMensuales;
    private Double precioPorHora;

    public Curso(String nombre, String descripcion, Integer duracionMeses, Integer horasMensuales, Double precioPorHora) {
        super(nombre, descripcion);
        this.duracionMeses = duracionMeses;
        this.horasMensuales = horasMensuales;
        this.precioPorHora = precioPorHora;
    }

    @Override
    public Double informarPrecio() {
        Double precioFinal = duracionMeses*horasMensuales*precioPorHora;
        return precioFinal;
    }
}
