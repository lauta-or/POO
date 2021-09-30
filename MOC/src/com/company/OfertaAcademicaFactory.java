package com.company;

import java.util.PropertyPermission;

public class OfertaAcademicaFactory {

    private static OfertaAcademicaFactory instance; //= new OfertaAcademicaFactory();

    private OfertaAcademicaFactory(){

    }
    public static OfertaAcademicaFactory getInstance(){

        if(instance == null){
            instance = new OfertaAcademicaFactory();
            }
        return instance;
    }

    public OfertaAcademica crearOfertaAcademica(String nombreOferta){

        switch (nombreOferta){
            case "FrontEnd":
                return new Curso ("Front End","abc",2, 16,1000.0);
            case "BackEnd":
                return new Curso ("Back End","abc", 2,20, 900.0);
            case "FullStack":
                ProgramaIntensivo programaIntensivo = new ProgramaIntensivo("Full Stack","asd",0.2);
                programaIntensivo.agregarOferta(crearOfertaAcademica("FrontEnd"));
                programaIntensivo.agregarOferta(crearOfertaAcademica("BackEnd"));
                return programaIntensivo;
            default:
                return null;
        }

    }

}
