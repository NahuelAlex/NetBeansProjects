
package condicionalesdia4;

import java.util.Scanner;

/**
 *Crear un programa que pida una frase y si esa frase es igual a “eureka” el
programa pondrá un mensaje de Correcto, sino mostrará un mensaje de
Incorrecto. Nota: investigar la función equals() en Java.
 * @author alexi
 */
public class Ejercicio2 {

    
    public static void main(String[] args) {
      String frase;
      Scanner leer = new Scanner(System.in);
      System.out.println("Ingrese una frase");
      frase = leer.nextLine();
      frase=frase.toUpperCase();
      if (frase.equals("EUREKA")){
          System.out.println("CORRECTO");
      }
      else {
          System.out.println("INCORRECTO");
      }
    }
}
