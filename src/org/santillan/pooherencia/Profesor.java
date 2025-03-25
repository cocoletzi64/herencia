package org.santillan.pooherencia;

public class Profesor extends Persona{
    private String asignatura;

    //constructor
    public Profesor() {
        System.out.println("Profesor: inicilaizando constructor...");
    }

    //getter and setter
    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }
}
