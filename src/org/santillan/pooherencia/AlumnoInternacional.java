package org.santillan.pooherencia;

public class AlumnoInternacional extends Alumno{
    private String pais;
    private double idiomas;

    //constructor

    public AlumnoInternacional() {
        System.out.println("Alumno Internacional: inicializando constructor...");
    }

    public AlumnoInternacional(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public AlumnoInternacional(String nombre, String apellido, String pais) {
        super(nombre, apellido);
        this.pais = pais;
    }
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

    @Override
    public String saludar() {
        return super.saludar()+" , soy extranjero del pais "+getPais();
    }

    @Override
    public double calcpromedio() {
        return ((super.calcpromedio()*3)+idiomas)/4;
    }
}
