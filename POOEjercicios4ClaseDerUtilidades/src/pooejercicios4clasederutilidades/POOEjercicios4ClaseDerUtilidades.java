/*
Vamos a usar la clase Calendar que ya existe en Java. Crearemos la clase
FechaService, en paquete Servicios, que tenga los siguientes métodos:
 */
package pooejercicios4clasederutilidades;

import java.util.Calendar;
import servicios.FechaService;

/**
 *
 * @author alexi
 */
public class POOEjercicios4ClaseDerUtilidades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FechaService fs = new FechaService();
        Calendar fechaNacimiento = fs.fechaNacimiento();
        Calendar fechaActual = fs.fechaActual();
        int edad = fs.diferencia(fechaNacimiento, fechaActual);
        System.out.println("tenes: " + edad + " Años");
    }

}
