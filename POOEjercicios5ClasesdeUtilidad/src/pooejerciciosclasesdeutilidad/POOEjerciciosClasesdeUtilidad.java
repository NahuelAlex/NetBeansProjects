package pooejerciciosclasesdeutilidad;

import entidades.Persona;
import java.util.Calendar;
import servicio.PersonaService;

/**
 * Implemente la clase Persona en el paquete entidades. Una persona tiene un nombre y una fecha de
 * nacimiento (Tipo Date), constructor vacío, constructor parametrizado, get y set. Crear una clase
 * PersonaService, en el paquete servicio, con los siguientes métodos:
 *
 * @author alexi
 */
public class POOEjerciciosClasesdeUtilidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaService ps = new PersonaService();       
        
        ps.crearPersona();
        
        
    }

}
