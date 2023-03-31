
package condicionalesdia4;

import java.util.Scanner;

/**
 *
 * @author alexi
 */
public class Condicionalesdia4 {

    /**Escriba un programa que pida una frase o palabra y valide si la primera
letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de
imprimir un mensaje por pantalla que diga “CORRECTO”, en caso
contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función
Substring y equals() de Java.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String frase;
      Scanner leer = new Scanner(System.in);
      System.out.println("Ingrese palabra o frase");
      frase = leer.nextLine();
      if (frase.substring(0,1).equals("A")){
          System.out.println("CORRECTO");
      }
      else {
          System.out.println("INCORRECTO");
      }
          
    }
    
}
