package org.santillan.pooherencia;

public class Alumno extends Persona{
    private String institucion;
    private double matematicas;
    private double castellano;
    private double historia;

    //constrructor
    public Alumno() {
        System.out.println("Alumno: inicializando constructor...");
    }

    //getter and setter
    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public double getMatematicas() {
        return matematicas;
    }

    public void setMatematicas(double matematicas) {
        this.matematicas = matematicas;
    }

    public double getCastellano() {
        return castellano;
    }

    public void setCastellano(double castellano) {
        this.castellano = castellano;
    }

    public double getHistoria() {
        return historia;
    }

    public void setHistoria(double historia) {
        this.historia = historia;
    }
}
