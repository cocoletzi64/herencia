package ejemplo;

import org.santillan.pooherencia.*;

public class EjemploherenciaConstructores {
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
        System.out.println("Imprimiendo los datos en comun del tipo persona: ");
        System.out.println("nombre: "+persona.getNombre()
                +", apellido: "+persona.getApellido()
                +", edad: "+persona.getEdad()
                +", email:"+persona.getEmail());

        if (persona instanceof Alumno){
            System.out.println("Imprimiendo todos los datos del tipo Alumno: ");
            System.out.println("Institucion: "+ ((Alumno) persona).getInstitucion());
            System.out.println("Nota matematicas: "+((Alumno) persona).getMatematicas());
            System.out.println("Nota Historia: "+((Alumno) persona).getHistoria());
            System.out.println("Nota Castellano: "+((Alumno) persona).getCastellano());

            if (persona instanceof AlumnoInternacional){
                System.out.println("Imprimiendo los datos del tipo Alumno Internacional: ");
                System.out.println("Nota idiomas: "+((AlumnoInternacional) persona).getIdiomas());
                System.out.println("Pais: "+((AlumnoInternacional) persona).getPais());
            }
        }
       if (persona instanceof Profesor){
           System.out.println("Imprimiendo los datos del tipo profesor: ");
           System.out.println("Asignatura: "+((Profesor) persona).getAsignatura());
       }

        System.out.println("============== sobre escritura saludar ===================");
        System.out.println(persona.saludar());
        System.out.println("=================================");
    }
}
