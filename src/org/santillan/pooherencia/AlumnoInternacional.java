package org.santillan.pooherencia;

public class AlumnoInternacional extends Alumno{
    private String pais;
    private double idiomas;

    //getter and setter

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(double idiomas) {
        this.idiomas = idiomas;
    }
}
