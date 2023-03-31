
package condicionalesdia4;

import java.util.Scanner;

/**
 *7. Realice un programa que calcule y visualice el valor máximo, el valor
mínimo y el promedio de n números (n>0). El valor de n se solicitará al
principio del programa y los números serán introducidos por el usuario.
Realice dos versiones del programa, una usando el bucle “while” y otra
con el bucle “do - while”.
 * @author alexi
 */
public class EjercicioExtra7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la cantidad de numeros");
        int n = leer.nextInt();
        int i=0;
        double suma = 0;
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        while (i < n) {
            System.out.println("Ingrese un numero");
            double num = leer.nextDouble();
            suma += num;
            if (num < min){
               min = num;
            }
            if (num > max){
               max = num;
            }
            i++;
        }
        double promedio = suma/n;
        System.out.println("El valor maximo es: " + max);
        System.out.println("El valor minimo es: " + min);
        System.out.println("El promedio es: " + promedio);
    }
    
}
