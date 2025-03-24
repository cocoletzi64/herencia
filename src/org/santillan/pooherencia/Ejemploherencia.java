package org.santillan.pooherencia;

public class Ejemploherencia {
    public static void main(String[] args) {
        Alumno erick=new Alumno();
        erick.setNombre("Erick");
        erick.setApellido("Cocoletzi");

        Profesor jose=new Profesor();
        jose.setNombre("Jose");
        jose.setApellido("Perez");
        jose.setAsignatura("Matematicas");

        System.out.println("Alumno "+erick.getNombre()+" "+erick.getApellido());
        System.out.println("Profesor "+jose.getAsignatura()+": "+jose.getNombre() +" "
                +jose.getApellido());

    }
}
