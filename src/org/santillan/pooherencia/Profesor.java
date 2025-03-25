package org.santillan.pooherencia;

public class Profesor extends Persona{
    private String asignatura;

    //constructor
    public Profesor() {
        System.out.println("Profesor: inicilaizando constructor...");
    }
    public Profesor(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public Profesor(String nombre, String apellido, String asignatura) {
        super(nombre, apellido);
        this.asignatura = asignatura;
    }



    //getter and setter
    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }
}
