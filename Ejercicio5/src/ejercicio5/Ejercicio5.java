
package ejercicio5;

import java.util.Scanner;

/**
 *Escribir un programa que lea un número entero por teclado y muestre por pantalla
el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().
 * @author alexi
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        int numero;
        System.out.println("Ingrese un numero");
        Scanner leer = new Scanner(System.in);
        numero = leer.nextInt();
        System.out.println("El doble de: " + numero + " es: " + numero * 2);
        System.out.println("El Triple de: " + numero + " es: " + numero * 3);
         System.out.println("La raiz cuadrada de: " + numero + " es: " + Math.sqrt(numero));
        
    }
    
}
