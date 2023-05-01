package servicio;

import entidades.Persona;
import java.util.Calendar;
import java.util.Scanner;

/**
 * Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear.
 * Retornar el objeto Persona creado. b) Método calcularEdad que calcule la edad del usuario
 * utilizando el atributo de fecha de nacimiento y la fecha actual. c) Método menorQue recibe como
 * parámetro una Persona y una edad. Retorna true si la persona es menor que la edad consultada o
 * false en caso contrario. d) Método mostrarPersona que muestra la información de la persona
 * deseada
 *
 * @author alexi
 */
public class PersonaService {

    Scanner leer = new Scanner(System.in);

    public Persona crearPersona() {
        Persona p1 = new Persona();
        System.out.println("Ingrese el nombre: ");
        p1.setName(leer.nextLine());
        System.out.println("Ingrese el año de nacimiento: ");
        int anio = leer.nextInt();
        System.out.println("Ingrese el mes de nacimiento: ");
        int mes = leer.nextInt();
        System.out.println("Ingrese el dia de nacimiento: ");
        int dia = leer.nextInt();
        Calendar fechaNacimiento = Calendar.getInstance();
        fechaNacimiento.set(anio - 1, mes - 1, dia);
        p1.setFechaNacimiento(fechaNacimiento);
        return p1;
    }

    /* Método calcularEdad que calcule la edad del usuario
 * utilizando el atributo de fecha de nacimiento y la fecha actual.*/
    public int calcularEdad(Persona p1) {
        Calendar fechaActual = Calendar.getInstance();

        int edad = fechaActual.get(Calendar.YEAR) - p1.getFechaNacimiento().get(Calendar.YEAR);
        if (fechaActual.get(Calendar.MONTH) < p1.getFechaNacimiento().get(Calendar.MONTH)) {
            edad--;
        } else if (fechaActual.get(Calendar.MONTH) == p1.getFechaNacimiento().get(Calendar.MONTH)
                && fechaActual.get(Calendar.DAY_OF_MONTH) < p1.getFechaNacimiento().get(Calendar.DAY_OF_MONTH)) {
        }
        edad--;

        return edad;
    }

    /*Método menorQue recibe como
 * parámetro una Persona y una edad. Retorna true si la persona es menor que la edad consultada o
 * false en caso contrario.*/
    public boolean menorQue(Persona edad) {
        boolean menorEdad = false;
        if () {

        }
    }
}
