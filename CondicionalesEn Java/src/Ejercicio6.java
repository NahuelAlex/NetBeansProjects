
import java.util.Scanner;
/**
 *Implementar un programa que le pida dos números enteros al usuario y
determine si ambos o alguno de ellos es mayor a 25.
 * @author alexi
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int num1, num2;
      System.out.println("Determinar si dos numeros enteros son mayores que 25");
      Scanner leer = new Scanner(System.in);  
      System.out.println("Ingrese el primer numero entero");
      num1 = leer.nextInt();
      System.out.println("Ingrese el segundo numero entero");
      num2 = leer.nextInt();
      if (num1 > 25 && num2 > 25) {
          System.out.println("los numeros son mayur que 25");
      }
      else if (num1 > 25 || num2 > 25) {
          System.out.println("Un numero es mayor a 25");
      } 
      else {
          System.out.println("Ningun numero es mayor que 25");
      }
    
    }
    
}
        
