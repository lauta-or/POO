package com.company;

public class ExamenFinal extends Examen implements Comparable {

    private Double notaOral;
    private String tema;

    public ExamenFinal(Alumno alumno, String titulo, String enunciado, Double nota, Double notaOral, String tema) {
        super(alumno, titulo, enunciado, nota);
        this.notaOral = notaOral;
        this.tema = tema;
    }


    @Override
    public int compareTo(Object object) {


        ExamenFinal otroExamen = (ExamenFinal) object;
        Double promedioThis = (this.notaOral + this.getNota())/2;
        Double promedioOtro = (otroExamen.notaOral + otroExamen.getNota())/2;

        if (promedioThis> promedioOtro){
            return 1;

        }
        if (promedioThis< promedioOtro){
            return -1;

        }
        return 0;

    }
    private Double calcularPromedio(){
            return (notaOral+ getNota()/2);
    }
}
