package ejemplo;

import org.santillan.pooherencia.*;

public class Ejemploherencia {
    public static void main(String[] args) {
        Alumno erick=new Alumno();
        erick.setNombre("Erick");
        erick.setApellido("Cocoletzi");
        erick.setInstitucion("Instituto nacional");
        erick.setCastellano(5.5);
        erick.setHistoria(6.3);
        erick.setMatematicas(4.9);

        AlumnoInternacional dolores=new AlumnoInternacional();
        dolores.setNombre("Dolores");
        dolores.setApellido("Campos");
        dolores.setPais("Mexico");
        dolores.setEdad(15);
        dolores.setInstitucion("Instituto Nacional");
        dolores.setIdiomas(6.8);
        dolores.setCastellano(6.2);
        dolores.setHistoria(5.8);
        dolores.setMatematicas(6.5);


        Profesor jose=new Profesor();
        jose.setNombre("Jose");
        jose.setApellido("Perez");
        jose.setAsignatura("Matematicas");

        System.out.println("Alumno "+erick.getNombre()+" "+erick.getApellido()
                +"\nEscuela:"+erick.getInstitucion());
        System.out.println("Profesor "+jose.getAsignatura()+": "+jose.getNombre() +" "
                +jose.getApellido());
        System.out.println("Alumno Internacional "+dolores.getNombre()+" "
                +dolores.getApellido()+"\n"+dolores.getInstitucion()+"\n"+dolores.getPais());

        Class clase= dolores.getClass();
        while(clase.getSuperclass() != null){
            String hija=clase.getName();
            String padre= clase.getSuperclass().getName();
            System.out.println(hija+"es una clase hija de la clase padre "+ padre);
            clase=clase.getSuperclass();
        }

    }
}
