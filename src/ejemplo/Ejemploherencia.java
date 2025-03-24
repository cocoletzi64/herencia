package ejemplo;

import org.santillan.pooherencia.*;

public class Ejemploherencia {
    public static void main(String[] args) {
        Alumno erick=new Alumno();
        erick.setNombre("Erick");
        erick.setApellido("Cocoletzi");
        erick.setInstitucion("Instituto nacional");

        Profesor jose=new Profesor();
        jose.setNombre("Jose");
        jose.setApellido("Perez");
        jose.setAsignatura("Matematicas");

        System.out.println("Alumno "+erick.getNombre()+" "+erick.getApellido()
                +"\nEscuela:"+erick.getInstitucion());
        System.out.println("Profesor "+jose.getAsignatura()+": "+jose.getNombre() +" "
                +jose.getApellido());

    }
}
