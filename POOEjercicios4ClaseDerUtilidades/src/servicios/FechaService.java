/*
 a) Método fechaNacimiento que pregunte al usuario día, mes y año de
su nacimiento. Luego los pase por parámetro a un nuevo objeto Date.
El método debe retornar el objeto Date. Ejemplo fecha: Date fecha =
new Date(anio, mes, dia);

 */
package servicios;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author alexi
 */
public class FechaService {

    Scanner leer = new Scanner(System.in);

    public Calendar fechaNacimiento() {
        System.out.println("Ingrese el dia de su nacimiento . ");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes de su nacimiento . ");
        int mes = leer.nextInt();
        System.out.println("Ingrese su año de nacimiento . ");
        int anio = leer.nextInt();
        Calendar fechaNacimiento = Calendar.getInstance();
        fechaNacimiento.set(anio-1, mes-1, dia);
        return fechaNacimiento;
    }

    /*b) Método fechaActual que cree un objeto fecha con el día actual. Para
esto usaremos el constructor vacío de la clase Date. Ejemplo: Date
fechaActual = new Date();
El método debe retornar el objeto Date.*/
    
    public Calendar fechaActual() {
        Calendar fechaActual = Calendar.getInstance();
        return fechaActual;
    }

    /*c) Método diferencia que reciba las dos fechas por parámetro y retorna
la diferencia de años entre una y otra (edad del usuario).*/
    public int diferencia(Calendar fechaNacimiento, Calendar fechaActual) {
        int edad = fechaActual.get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR);
        if (fechaActual.get(Calendar.MONTH) < fechaNacimiento.get(Calendar.MONTH)) {
            edad--;
        } else if (fechaActual.get(Calendar.MONTH) == fechaNacimiento.get(Calendar.MONTH)
                && fechaActual.get(Calendar.DAY_OF_MONTH) < fechaNacimiento.get(Calendar.DAY_OF_MONTH)) {
        }
        edad--;
        return edad;
    }
}
