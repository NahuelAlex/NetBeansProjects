
package ejercicio4;

import java.util.Scanner;

/**
 *Dada una cantidad de grados centígrados se debe mostrar su equivalente en
grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 * @author alexi
 */
public class Ejercicio4 {

    public static void main(String[] args) {
      float c, f;
        System.out.println("Ingrese la temperatura en c°");
        Scanner leer = new Scanner(System.in);
        c = leer.nextFloat();
        f = 32 + (9 * c / 5);
        System.out.println("La temperatura en Fahrenheit es: " + f);
        System.out.println(32 + (9 * c / 5));
    }
    
}
