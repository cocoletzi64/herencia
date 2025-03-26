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

    public Alumno(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public Alumno(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    public Alumno(String nombre, String apellido, int edad, String institucion) {
        super(nombre, apellido, edad);
        this.institucion = institucion;
    }

    public Alumno(String nombre, String apellido, int edad, String institucion,
                  double matematicas, double castellano, double historia) {
        super(nombre, apellido, edad);
        this.institucion = institucion;
        this.matematicas = matematicas;
        this.castellano = castellano;
        this.historia = historia;
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

    //metodos
    @Override
    public String saludar(){
        String saludar=super.saludar();
        return saludar+" ,soy un alumno y mi nombre es: "+getNombre();

    }
    public double calcpromedio(){
        return (historia+castellano+matematicas)/3;
    }
}
