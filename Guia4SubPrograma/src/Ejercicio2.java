
import java.util.Scanner;


/**
 *Diseñe una función que pida el nombre y la edad de N personas e
imprima los datos de las personas ingresadas por teclado e indique si
son mayores o menores de edad. Después de cada persona, el programa
debe preguntarle al usuario si quiere seguir mostrando personas y frenar
cuando el usuario ingrese la palabra “No”.
 * @author alexi
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        datosPersona();
    }
   public static void datosPersona () {

        Scanner leer = new Scanner(System.in);
        String resp = "s";
        do {
             System.out.println("Ingrese un nombre y la edad de una persona: ");
        String nombre = leer.next();
        int edad = leer.nextInt();
        if(edad>17) {
            System.out.println(nombre + " Es mayor de edad");
        } else {
            System.out.println(nombre + "  No es mayor de edad");
        }
        System.out.println("Desea ingresar mas datos de persona s/n?");
        resp = leer.next();
        } while (!resp.equals("n"));

} 
}

    