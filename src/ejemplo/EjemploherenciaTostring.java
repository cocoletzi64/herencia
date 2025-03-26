package ejemplo;

import org.santillan.pooherencia.Alumno;
import org.santillan.pooherencia.AlumnoInternacional;
import org.santillan.pooherencia.Persona;
import org.santillan.pooherencia.Profesor;

public class EjemploherenciaTostring {
    public static void main(String[] args) {

        System.out.println("======= Creando la instacia de la clase alumno =========");
        Alumno erick=new Alumno("Erick","Cocoletzi",13,"Instituto nacional");
        erick.setCastellano(5.5);
        erick.setHistoria(6.3);
        erick.setMatematicas(4.9);
        erick.setEmail("erickalbertosantillancocoletzi@gmail.com");

        System.out.println("======= Creando la instacia de la clase alumno Internacional =========");

        AlumnoInternacional dolores=new AlumnoInternacional("Dolores","Campos","Mexico");
        dolores.setEdad(15);
        dolores.setInstitucion("Instituto Nacional");
        dolores.setIdiomas(6.8);
        dolores.setCastellano(6.2);
        dolores.setHistoria(5.8);
        dolores.setMatematicas(6.5);
        dolores.setEmail("dolores@gmail.com");

        System.out.println("======= Creando la instacia de la clase Profesor =========");
        Profesor jose=new Profesor("Jose","Perez","Matematicas");
        jose.setEdad(37);
        jose.setEmail("joseprofesor@gmail.com");

        System.out.println("========================");
        imprimir(erick);
        imprimir(dolores);
        imprimir(jose);
    }
    public static void imprimir(Persona persona){
        System.out.println("========================");
        System.out.println(persona);
    }
}
