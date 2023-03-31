
package condicionalesdia4;

import java.util.Scanner;

/**
 *Escribir un programa que lea un número entero y devuelva el número de
dígitos que componen ese número. Por ejemplo, si introducimos el
número 12345, el programa deberá devolver 5. Calcular la cantidad de
dígitos matemáticamente utilizando el operador de división. Nota:
recordar que las variables de tipo entero truncan los números o
resultados.
 * @author alexi
 */
public class EjercicioExtra11 {

    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
      int num = leer.nextInt();
      int cantidad=0;
      while(num !=0) {
         num = num/10;
         cantidad ++;
} 
        System.out.println(cantidad);
    }
    
}
