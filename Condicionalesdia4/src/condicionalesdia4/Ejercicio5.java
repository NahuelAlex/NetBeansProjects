package condicionalesdia4;

import java.util.Scanner;

/**
 *Escriba un programa en el cual se ingrese un valor límite positivo, y a
continuación solicite números al usuario hasta que la suma de los
números introducidos supere el límite inicial.
 * @author alexi
 */
public class Ejercicio5 {

  
    public static void main(String[] args) {
    int num, suma = 0,limite;
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese el valor limite");
    limite = leer.nextInt();
       do  {
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            suma=suma+num;
        }
       while (suma <= limite);
    }
    
}
