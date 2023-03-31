package condicionalesdia4;

import java.util.Scanner;

/**
 *Escriba un programa que pida una frase o palabra y valide si la primera
letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de
imprimir un mensaje por pantalla que diga “CORRECTO”, en caso
contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función
Substring y equals() de Java.
 * @author alexi
 */
public class Ejercicio4 {

    public static void main(String[] args) {
      String frase,palabra;
      Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase o palabra");
        frase = leer.nextLine();
        palabra = frase.substring(0, 1);
        palabra = palabra.toUpperCase();
        if (palabra.equals("A")){
            System.out.println("CORRECTO");
        }
        else {
            System.out.println("INCORRECTO");
        }
    }
    
}
