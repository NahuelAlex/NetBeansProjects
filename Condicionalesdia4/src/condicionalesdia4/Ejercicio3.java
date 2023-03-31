package condicionalesdia4;

import java.util.Scanner;

/**
 *Realizar un programa que solo permita introducir solo frases o palabras
de 8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo se
deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en
caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la
función Lenght() en Java.
 * @author alexi
 */
public class Ejercicio3 {

   
    public static void main(String[] args) {
      String palabra;
      Scanner leer = new Scanner(System.in);
      System.out.println("Ingrese un frase o palabra");
      palabra = leer.nextLine();
      if(palabra.length()==8){
        System.out.println("Correcto");
      }
      else {
          System.out.println("Incorrecto");
      }
    }
    
}
